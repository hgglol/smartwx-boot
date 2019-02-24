/*
 * FileName：UserTagDao.java
 * <p>
 * Copyright (c) 2017-2020, <a href="http://www.webcsn.com">hermit (794890569@qq.com)</a>.
 * <p>
 * Licensed under the GNU General Public License, Version 3 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/gpl-3.0.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.wxmp.wxcms.mapper;

import com.wxmp.wxcms.domain.UserTag;

import java.util.List;

/**
 * @author fuzi Kong
 * @version 2.0
 * @date 2018-04-17 10:54:58
 */
public interface UserTagDao {

    UserTag getById(Integer id);

    List<UserTag> getUserTagListByPage(UserTag searchEntity);

    void add(UserTag entity);

    void addList(List<UserTag> list);

    void update(UserTag entity);

    void delete(UserTag entity);

    /**
     * <p>
     * 删除（根据ID 批量删除）
     * </p>
     *
     * @param ids 主键ID列表
     * @return int
     */
    Integer deleteBatchIds(String[] ids);

    /**
     * 获取最大的ID和本地库存的比较决定是否同步
     *
     * @return
     */
    Integer getMaxId();
}
