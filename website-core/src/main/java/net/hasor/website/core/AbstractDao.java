/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.website.core;
import net.hasor.core.Inject;
import net.hasor.plugins.mybatis3.SqlExecutorOperations;
import net.hasor.website.domain.beans.AppConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @version : 2015年5月22日
 * @author 赵永春 (zyc@hasor.net)
 */
public abstract class AbstractDao<T> {
    protected Logger                logger = LoggerFactory.getLogger(getClass());
    @Inject(AppConstant.DB_MYSQL)
    private   SqlExecutorOperations executorTemplate;
    //
    protected SqlExecutorOperations getSqlExecutor() {
        return this.executorTemplate;
    }
    //
}