Test plan for in-car GPS navigation system
------------------------------------------
Overview
--------
As technology is growing, people are getting to use GPS navigation systems that are embedded in their cars to help them 
going to their destination. This description provides a test plan for in-car GPS navigation system of one of the major car
manufacturers. As in-car GPS navigation system is a critical system, it is required to design a robust test plan to insure
that system is free of bugs and operates exactly as it is intended to do.

System Requirements
-------------------
-	Car with built-in GPS navigation system
-	Internet connection coverage.

Risks and mitigation
--------------------
-	Absence of internet connection would lead to misleading results, to minimize this risk tests should be executed
in areas with good 3G internet coverage.
-	Misunderstanding of system notifications and instructions may lead to wrong results; users should be trained
on the system before performing the testing.

GPS navigation system could be decomposed into following components
-------------------------------------------------------------------
-	Map drawing feature, with car position is marked as pen, pen should be moving while car is moving.
-	Route determination between current place and destination place.
-	Voice instruction, as GPS navigator system should give proper voice instructions while driver is following
the route to specific destination.
-	GPS navigation system should allow user to save route history.
-	GPS navigation system should allow user to retrieve and use route from history.
-	GPS navigation system should provide an alternate route, so user can select one of alternate routes.
-	Navigator should give information to driver while moving to destination, like distance elapsed, remaining distance,
and estimated time remaining to reach destination.
-	GPS navigation system should allow user to drop pens to identify locations on the map.
-	GPS navigation system should allow user to get location details by selecting pen previously dropped by user.

The three most important types of testing
-----------------------------------------
-	Unit test:  test cases should be written to test all system components separately.
-	Regression test: it ensures that any bugs have been fixed and that no other previously working 
functions have failed as a result of the reparations and that newly added features have not created
problems with previous versions of the software.
-	User acceptance test: it is to ensure that the system satisfies the needs of the business as specified 
in the requirements and provides confidence in its use.

The three less important types of testing
-----------------------------------------
-	Performance test:  as this type of test is more concerned about performance, for example how the system performs
when large number of users are using the system at the same time, due to limited resources “few cars with
built-in GPS navigator” this type of test will not be feasible.
-	Security test: as the GPS navigation system has no login or certain security constrains, security testing will be 
less important.
-	Usability testing: as this type of testing is concerned about the friendliness of the system, and how new users
with less experience would easily understand the system, this is less important test as it considered as “luxury” type testing. 


