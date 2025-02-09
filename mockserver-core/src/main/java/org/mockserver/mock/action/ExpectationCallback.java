package org.mockserver.mock.action;

import org.mockserver.model.HttpObject;
import org.mockserver.model.HttpRequest;

/**
 * @author jamesdbloom
 */
public interface ExpectationCallback<T extends HttpObject> {

    /**
     * Called for every request when expectation condition has been satisfied.
     * The request that satisfied the expectation condition is passed as the
     * parameter and the return value is the request that will be proxied or returned.
     *
     * @param httpRequest the request that satisfied the expectation condition
     * @return the request that will be proxied or the response that will be returned
     */
    T handle(HttpRequest httpRequest) throws Exception;
}
