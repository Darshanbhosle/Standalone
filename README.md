# Standalone

```mermaid
graph TD;
    SignInPage-->HomePage--include testcases which is on MysearchPage named as clickon my search -->MySearchPage--include testcases which is on RateResultPage named as clickon search-->RateResultPage--include testcases which is on RateSummaryPage named as clickon select-->RateSummaryPage--include testcases which is on RateBookingPage named as clickon order-->RateBookingPage;
    HomePage-->DashBoardPage;
    DashBoardPage-->CompleteOrderPage;
    DashBoardPage-->CancelledOrderPage;
    DashBoardPage-->FavoritePage;
    DashBoardPage-->ProfilePage;
    
```
![image](https://user-images.githubusercontent.com/117973924/215289004-6c5f6b6c-8b95-41ff-a1ac-5230f8b6649e.png)
![image](https://user-images.githubusercontent.com/117973924/215289520-35001517-694a-44eb-93de-e506ae7a70cd.png)


