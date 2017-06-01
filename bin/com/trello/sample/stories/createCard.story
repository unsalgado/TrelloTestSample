Meta:

@Scenario createCard

Scenario: Create Text Only Card to Communicate
Given Load Trello
When Login to Trello using username: dulaniinoka password: test12345
And  Navigate to CingleVue-UI-Board
And Click to Add Card
And Add Text: UI- Chnages
Then Click Add Button
And Verify Card added successfully

