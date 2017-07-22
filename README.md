# self-healing-services-with-circuit-breaker

Demo on Hystrix circuit breaker, how weather-app takes over the response
and opens the circuit when weather-service is not reachable.

1. Run discovery-server
2. Run weather-service
3. Run weather-app
4. Curl $: curl localhost:8000/current/weather (observe response)
5. Stop weather-service
6. Curl $: curl localhost:8000/current/weather (observe response)
7. Bring down all instances