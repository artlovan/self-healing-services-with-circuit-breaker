# self-healing-services-with-circuit-breaker

Demo on Hystrix circuit breaker, how weather-app takes over the response
and opens the circuit when weather-service is not reachable.

1. Run discovery-server
2. Run weather-service
3. Run weather-app
4. Run hystrix-dashboard
5. In browser, go to http://localhost:8080/hystrix
6. Run curl few times: $ curl localhost:8000/current/weather
7. Back in browser, in input field; enter "http://localhost:8000/hystrix.stream"
8. Add title in Title input field "Weather App"
9. Click "Monitor Stream" button
10. You can run No. 7 to generate new metrics
11. For real fun, with apache benchmark, run: $ ab -c 20 -n 100 localhost:8000/current/weather
12. Bring down all you instances
