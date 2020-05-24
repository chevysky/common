package com.bulu.common;

import com.bulu.common.enums.SortEnum;
import com.google.common.base.Joiner;
import lombok.*;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

/**
 * @author chevysky
 * 分页
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PageRequest {

    private int page = 1;

    private int size = 10;

    private SortEnum sort;

    private List<String> field;

    @Override
    public String toString() {
        StringBuilder sql = new StringBuilder();
        if (CollectionUtils.isEmpty(field)) {
            sql.append("id ");
        } else {
            sql.append(Joiner.on(",").join(field)).append(" ");
        }

        sort = Objects.nonNull(sort) ? sort : SortEnum.ASC;
        sql.append(sort);
        sql.append(" LIMIT ").append(page - 1).append(",").append(size);
        return sql.toString();
    }
}
