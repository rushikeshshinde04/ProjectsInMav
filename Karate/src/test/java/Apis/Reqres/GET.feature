Feature: Get users from ReqRes

@execute
Scenario: Get list of users
Given url baseURL
And path '/api/users?page=2'
When method GET
Then status 200


@execute
Scenario: Get specific user details by id
Given url baseURL
And path '/api/users/2'
When method GET
Then status 200

@execute
Scenario: Get specific user not founnd
Given url baseURL
And path '/api/users/23'
When method GET
Then status 404

@execute
Scenario: Get list resource unknown
Given url baseURL
And path '/api/unknown'
When method GET
Then status 200

@execute
Scenario: Get single resource unknown
Given url baseURL
And path '/api/unknown/2'
When method GET
Then status 200

@execute
Scenario: Get single resource not found
Given url baseURL
And path '/api/unknown/23'
When method GET
Then status 404

@execute
Scenario: Get delayed response user
Given url baseURL
And path '/api/users?delay=3'
When method GET
Then status 200