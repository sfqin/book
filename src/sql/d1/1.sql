


ALTER TABLE student ADD COLUMN class_id INT(11) NOT NULL DEFAULT 1 COMMENT '班级id';


DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `class_id` int(11) NULL DEFAULT NULL COMMENT '班级id',
  `class_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '班级名称',
  `week_day` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '星期几',
  `course_id` int(11) NULL DEFAULT NULL COMMENT '课程id',
  `course_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名',
  `course_start_time` time(0) NULL DEFAULT NULL COMMENT '课程开始时间',
  `course_end_time` time(0) NULL DEFAULT NULL COMMENT '课程结束时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程表' ROW_FORMAT = Dynamic;

INSERT INTO `course` VALUES (1, 1, '新化五中1班', 'monday', 1, '语文', '08:00:00', '09:40:00');
INSERT INTO `course` VALUES (2, 1, '新化五中1班', 'monday', 2, '数学', '14:00:00', '15:40:00');
INSERT INTO `course` VALUES (3, 1, '新化五中1班', 'tuesday', 2, '数学', '08:00:00', '09:40:00');
INSERT INTO `course` VALUES (4, 1, '新化五中1班', 'tuesday', 1, '语文', '10:00:00', '11:40:00');
INSERT INTO `course` VALUES (5, 1, '新化五中1班', 'wednesday', 1, '语文', '14:00:00', '15:40:00');
INSERT INTO `course` VALUES (6, 1, '新化五中1班', 'wednesday', 1, '语文', '16:00:00', '17:40:00');
INSERT INTO `course` VALUES (7, 1, '新化五中1班', 'thursday', 2, '数学', '08:00:00', '09:40:00');
INSERT INTO `course` VALUES (8, 1, '新化五中1班', 'thursday', 2, '数学', '10:00:00', '11:40:00');
INSERT INTO `course` VALUES (9, 1, '新化五中1班', 'friday', 3, '音乐', '10:00:00', '11:40:00');
INSERT INTO `course` VALUES (10, 1, '新化五中1班', 'friday', 4, '体育', '14:00:00', '15:40:00');
INSERT INTO `course` VALUES (11, 2, '新化五中2班', 'monday', 2, '数学', '14:00:00', '15:40:00');
INSERT INTO `course` VALUES (12, 2, '新化五中2班', 'tuesday', 2, '数学', '08:00:00', '09:40:00');
INSERT INTO `course` VALUES (13, 2, '新化五中2班', 'tuesday', 1, '语文', '10:00:00', '11:40:00');
INSERT INTO `course` VALUES (14, 2, '新化五中2班', 'tuesday', 3, '音乐', '16:00:00', '17:40:00');
INSERT INTO `course` VALUES (15, 2, '新化五中2班', 'wednesday', 1, '语文', '08:00:00', '09:40:00');
INSERT INTO `course` VALUES (16, 2, '新化五中2班', 'wednesday', 4, '体育', '10:00:00', '11:40:00');
INSERT INTO `course` VALUES (17, 2, '新化五中2班', 'wednesday', 2, '数学', '14:00:00', '15:40:00');
INSERT INTO `course` VALUES (18, 2, '新化五中2班', 'wednesday', 5, '英语', '16:00:00', '17:40:00');
INSERT INTO `course` VALUES (19, 2, '新化五中2班', 'thursday', 2, '数学', '14:00:00', '15:40:00');
INSERT INTO `course` VALUES (20, 2, '新化五中2班', 'thursday', 2, '数学', '10:00:00', '11:40:00');
INSERT INTO `course` VALUES (21, 2, '新化五中2班', 'friday', 3, '体育', '10:00:00', '11:40:00');
INSERT INTO `course` VALUES (22, 2, '新化五中2班', 'friday', 1, '语文', '14:00:00', '15:40:00');
INSERT INTO `course` VALUES (23, 2, '新化五中2班', 'friday', 2, '数学', '16:00:00', '17:40:00');