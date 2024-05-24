CREATE DATABASE personnel_management;

USE personnel_management;

CREATE TABLE user (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      username VARCHAR(50) NOT NULL UNIQUE,
                      password VARCHAR(100) NOT NULL
);


CREATE TABLE Personnel (
                           id INT PRIMARY KEY AUTO_INCREMENT,
                           name VARCHAR(50),
                           age INT,
                           gender VARCHAR(10),
                           position VARCHAR(50),
                           salary DECIMAL(10, 2),
                           hire_year INT
);


INSERT INTO Personnel (name, age, gender, position, salary, hire_year)
VALUES
    ('王小明', 32, '男', '工程师', 15000.00, 2016),
    ('张丽', 28, '女', '销售经理', 12000.00, 2019),
    ('刘伟', 35, '男', '产品经理', 18000.00, 2014),
    ('陈婷', 26, '女', '人力资源专员', 10000.00, 2018),
    ('李红', 29, '女', '财务主管', 13000.00, 2017),
    ('周刚', 31, '男', '市场营销总监', 20000.00, 2015),
    ('赵霞', 33, '女', '技术总监', 22000.00, 2013),
    ('孙阳', 27, '男', '设计经理', 17000.00, 2020),
    ('朱佳', 30, '女', '运营经理', 16000.00, 2012),
    ('徐明', 34, '男', '项目经理', 19000.00, 2011);


CREATE TABLE Customers (
                           CustomerName VARCHAR(100),
                           ResponsiblePerson VARCHAR(100),
                           Project VARCHAR(100),
                           StartDate DATE
);


INSERT INTO Customers (CustomerName, ResponsiblePerson, Project, StartDate)
VALUES
    ('张三公司', '张三', '项目A', '2024-01-01'),
    ('李四有限公司', '李四', '项目B', '2024-02-15'),
    ('王五集团', '王五', '项目C', '2024-03-20'),
    ('赵六企业', '赵六', '项目D', '2024-04-10'),
    ('孙七科技', '孙七', '项目E', '2024-05-05'),
    ('周八制造', '周八', '项目F', '2024-06-30'),
    ('吴九股份', '吴九', '项目G', '2024-07-25'),
    ('郑十有限责任公司', '郑十', '项目H', '2024-08-12'),
    ('黄十一实业', '黄十一', '项目I', '2024-09-03'),
    ('陈十二科技有限公司', '陈十二', '项目J', '2024-10-18');
