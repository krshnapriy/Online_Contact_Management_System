# Online Contact Management System


### Database Schema:

User Table:

● User_id (Primary Key)

● Name

● Phone Number

● Email 

### Endpoints
 
1. POST /api/v1/users – Add Users

@PostMapping("/api/v1/users")
    public UserInfo saveUser(@RequestBody UserInfo userInfo){
	return userService.saveUser(userInfo);
    }

This endpoint allows the addition of users to the system. Use a POST request to add new users, providing details such as name, phone number, and email in the reqest body.
# 
2. GET /api/v1/users/{id} – Get User Details

@GetMapping("/api/v1/users/{id}")
    public UserInfo getUserById(@PathVariable("id") Long userId){
        return userService.getUserById(userId);
    }

Retrieve detailed information about a specific user by providing the user ID in the request path.
# 
3. PUT /api/v1/users/{id} – Update User

@PutMapping("/api/v1/users/{id}")
    public UserInfo updateUser(@PathVariable("id") Long userId, @RequestBody UserInfo userInfo){
        return userService.updateUser(userId, userInfo);
    }
    
Update user information using a PUT request. Provide the updated details in the request body, allowing users to modify their information.
# 
4. DELETE /api/v1/users/{id} – Delete User

@DeleteMapping("/api/v1/users/{id}")
    public void deleteUserById(@PathVariable("id") Long userId) {
        userService.deleteUserById(userId);
    }

Effortlessly remove a user from the system using a DELETE request with the user ID in the path
