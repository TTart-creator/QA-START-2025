Feature: training scenario

Scenario: Google and random people test
Given request 3 random people from API
And I store those people in database
And I pick a single random person from DB
And I load google page
And I accept cookies if they are present

When I set search to random person name
Then Search field contains random person name
