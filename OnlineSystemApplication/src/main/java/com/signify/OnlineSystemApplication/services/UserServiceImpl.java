package com.signify.OnlineSystemApplication.services;
import com.signify.OnlineSystemApplication.entity.UserInfo;
import com.signify.OnlineSystemApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserServiceImpl implements UserServices {
    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserInfo saveUser(UserInfo userInfo) {
        logger.info("\n\n\nLog: User Details Saved!\n\n\n");
        return userRepository.save(userInfo);
    }

    @Override
    public UserInfo getUserById(Long userId) {
        logger.info("\n\n\nLog: User Details Displayed!\n\n\n");
        return userRepository.findById(userId).get();
    }

    @Override
    public UserInfo updateUser(Long userId, UserInfo userInfo) {

        UserInfo userInfoDB = userRepository.findById(userId).get();

        if (Objects.nonNull(userInfo.getUserName()) && !"".equalsIgnoreCase(userInfo.getUserName())) {
            userInfoDB.setUserName(userInfo.getUserName());
        }

        if (Objects.nonNull(userInfo.getUserPhoneNumber()) && !"".equalsIgnoreCase(userInfo.getUserPhoneNumber())) {
            userInfoDB.setUserPhoneNumber(userInfo.getUserPhoneNumber());
        }

        if (Objects.nonNull(userInfo.getUserEmailAddress()) && !"".equalsIgnoreCase(userInfo.getUserEmailAddress())) {
            userInfoDB.setUserEmailAddress(userInfo.getUserEmailAddress());
        }

        logger.info("\n\n\nLog: User Details Updated!\n\n\n");
        return userRepository.save(userInfoDB);
    }

    @Override
    public String deleteUserById(Long userId) {
        userRepository.deleteById(userId);
        logger.info("\n\n\nLog: User Details Deleted!\n\n\n");
        return("Success");
    }
}