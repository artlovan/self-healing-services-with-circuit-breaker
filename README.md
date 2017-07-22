# circuit-breaker-hystrix-dashboard-turbine-service-discovery

Demo on Turbite, aggregating hystrix dashboards.

1. Run discovery-server
2. Run services: weather-service, weather-app, datetime-service, datetime-app, hystrix-dashboard
3. Run turbine service
4. Generate metrics (hit few times): $ curl localhost:8000/current/weather && curl localhost:8001/current/time
5. In browser, go to http://localhost:8080/hystrix
6. In input field; enter "http://localhost:3000/turbine.stream" 
7. Add title in Title input field "Turbine"
8. Generate metrics: run: $ curl localhost:8000/current/weather && curl localhost:8001/current/time
9. Observe Turbine dashboard
10. Bring down all your instances