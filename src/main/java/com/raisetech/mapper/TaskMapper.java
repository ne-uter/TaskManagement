package com.raisetech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.raisetech.entity.Task;

@Mapper
public interface TaskMapper {
	
	// 未完了タスクの一覧取得
	List<Task> selectIncompleteTasks();
	
    //計算式1件登録
	void insertTask(Task task);
}
