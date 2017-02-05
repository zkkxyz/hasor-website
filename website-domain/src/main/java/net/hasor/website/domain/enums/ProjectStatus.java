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
package net.hasor.website.domain.enums;
import net.hasor.website.domain.GeneralEnumParsing;
import org.more.util.StringUtils;
/**
 * 项目状态
 * @version : 2016年08月11日
 * @author 赵永春(zyc@hasor.net)
 */
public enum ProjectStatus implements GeneralEnumParsing<ProjectStatus> {
    // .个人首页
    Init(0, "初始筹备"),//
    Publish(1, "正常活跃"),//变迁：0 -> 1
    //
    // .首页产品
    Auditing(2, "审核"),// 变迁：1 -> 2
    Recommend(3, "推荐首页"),// 变迁：2 -> 3
    Clearup(4, "整理期"),// 变迁：3 -> 4
    Archives(5, "已归档"),// 变迁：5 -> 5
    //
    // .尘归尘土归土
    Recovery(6, "回收"),// 变迁：0,1,5  ->  6
    Invalid(-1, "失效"),// 变迁：6      -> -1
    ;
    //
    private int    type;
    private String desc;
    ProjectStatus(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
    public int getType() {
        return type;
    }
    public String getDesc() {
        return desc;
    }
    //
    public ProjectStatus formType(int type) {
        for (ProjectStatus item : ProjectStatus.values()) {
            if (item.getType() == type) {
                return item;
            }
        }
        return null;
    }
    public ProjectStatus formName(String name) {
        for (ProjectStatus item : ProjectStatus.values()) {
            if (StringUtils.equalsIgnoreCase(item.name(), name)) {
                return item;
            }
        }
        return null;
    }
}