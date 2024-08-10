Feature: Delete users from ReqRes

@execute
Scenario: Delete users
Given url baseURL
And path '/api/users/2'
When method DELETE
Then status 204