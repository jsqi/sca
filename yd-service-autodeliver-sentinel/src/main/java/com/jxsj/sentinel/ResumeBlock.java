package com.jxsj.sentinel;

import org.springframework.web.bind.annotation.PathVariable;

import javax.swing.text.BadLocationException;

public class ResumeBlock {

    public static Integer blockResume(@PathVariable Long userId, BadLocationException badLocationException) {
        System.out.println("限流了");
        return -7;
    }
}
