Feature: Update users from ReqRes

@execute
Scenario: Update users
Given url baseURL
And path '/api/users/2'
And request
"""
{
    "name": "morpheus",
    "job": "zion resident"
}
"""
When method PATCH
Then status 200