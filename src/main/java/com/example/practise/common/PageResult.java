package com.example.practise.common;


import com.github.pagehelper.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> {
    private Page<T> data;
    private long totalNum;
    private int pages;

    @Override
    public String toString() {
        return "PageResult{" +
                "data=" + data +
                ", totalNum=" + totalNum +
                ", pages=" + pages +
                '}';
    }
}
