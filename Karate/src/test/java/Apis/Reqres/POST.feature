Feature: Add users from ReqRes

@execute
Scenario: Create users
Given url baseURL
And path '/api/users'
And request
"""
{
    "name": "morpheus",
    "job": "leader"
}
"""
When method POST
Then status 201

@execute
Scenario: Register successful
Given url baseURL
And path '/api/register'
And request
"""
{
    "email": "eve.holt@reqres.in",
    "password": "pistol"
}
"""
When method POST
Then status 200

@execute
Scenario: Register unsuccessful
Given url baseURL
And path '/api/register'
And request
"""
{
    "email": "sydney@fife"
}
"""
When method POST
Then status 400

@execute
Scenario: Login successful
Given url baseURL
And path '/api/login'
And request
"""
{
    "email": "eve.holt@reqres.in",
    "password": "cityslicka"
}
"""
When method POST
Then status 200

@execute
Scenario: Login unsuccessful
Given url baseURL
And path '/api/login'
And request
"""
{
    "email": "peter@klaven"
}
"""
When method POST
Then status 400