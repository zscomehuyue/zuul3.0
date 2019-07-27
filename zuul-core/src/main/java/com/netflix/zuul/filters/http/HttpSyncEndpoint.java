/*
 *
 *
 *  Copyright 2013-2015 Netflix, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 * /
 */

package com.netflix.zuul.filters.http;

import com.netflix.zuul.filters.SyncEndpoint;
import com.netflix.zuul.message.ZuulMessage;
import com.netflix.zuul.message.http.HttpRequestMessage;
import com.netflix.zuul.message.http.HttpResponseMessage;
import com.netflix.zuul.message.http.HttpResponseMessageImpl;

/**
 * User: Mike Smith
 * Date: 6/16/15
 * Time: 12:23 AM
 */
public abstract class HttpSyncEndpoint extends SyncEndpoint<HttpRequestMessage, HttpResponseMessage>
{
    @Override
    public HttpResponseMessage getDefaultOutput(HttpRequestMessage request)
    {
        return HttpResponseMessageImpl.defaultErrorResponse(request);
    }
}
