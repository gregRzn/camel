/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rss;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RssEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RssEndpoint target = (RssEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "feedheader":
        case "feedHeader": target.setFeedHeader(property(camelContext, boolean.class, value)); return true;
        case "filter": target.setFilter(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lastupdate":
        case "lastUpdate": target.setLastUpdate(property(camelContext, java.util.Date.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "sortentries":
        case "sortEntries": target.setSortEntries(property(camelContext, boolean.class, value)); return true;
        case "splitentries":
        case "splitEntries": target.setSplitEntries(property(camelContext, boolean.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "throttleentries":
        case "throttleEntries": target.setThrottleEntries(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("backoffErrorThreshold", int.class);
        answer.put("backoffIdleThreshold", int.class);
        answer.put("backoffMultiplier", int.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("delay", long.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("feedHeader", boolean.class);
        answer.put("filter", boolean.class);
        answer.put("greedy", boolean.class);
        answer.put("initialDelay", long.class);
        answer.put("lastUpdate", java.util.Date.class);
        answer.put("password", java.lang.String.class);
        answer.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        answer.put("repeatCount", long.class);
        answer.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        answer.put("scheduler", java.lang.Object.class);
        answer.put("schedulerProperties", java.util.Map.class);
        answer.put("sendEmptyMessageWhenIdle", boolean.class);
        answer.put("sortEntries", boolean.class);
        answer.put("splitEntries", boolean.class);
        answer.put("startScheduler", boolean.class);
        answer.put("synchronous", boolean.class);
        answer.put("throttleEntries", boolean.class);
        answer.put("timeUnit", java.util.concurrent.TimeUnit.class);
        answer.put("useFixedDelay", boolean.class);
        answer.put("username", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        RssEndpoint target = (RssEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "delay": return target.getDelay();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "feedheader":
        case "feedHeader": return target.isFeedHeader();
        case "filter": return target.isFilter();
        case "greedy": return target.isGreedy();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "lastupdate":
        case "lastUpdate": return target.getLastUpdate();
        case "password": return target.getPassword();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "sortentries":
        case "sortEntries": return target.isSortEntries();
        case "splitentries":
        case "splitEntries": return target.isSplitEntries();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "synchronous": return target.isSynchronous();
        case "throttleentries":
        case "throttleEntries": return target.isThrottleEntries();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "username": return target.getUsername();
        default: return null;
        }
    }
}

