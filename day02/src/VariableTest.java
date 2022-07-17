/**
 * @ClassName: VariableTest
 * @author: 蜡笔小猪
 * @Date: 2022/7/16 12:09
 * @Description:
 * 变量的概念：
 *  内存中的一个存储区域
 *  该区域的数据可以在同一类型范围内不断变化
 *  变量是程序中最基本的存储单元。包含变量类型、变量名和存储的值
 *
 * 变量的作用：
 *  用于在内存中保存数据
 *
 * 使用变量的注意事项：
 *  Java中每个变量必须先声明，后使用
 *  使用变量名来访问这块区域的数据
 *  变量的作用域：其定义所在的一对{ }内
 *  变量只有在其作用域内才有效
 *  同一个作用域内，不能定义重名的变量
 *
 * 变量的声明和赋值
 *   语法： <数据类型> <变量名> = <初始化值>
 *   例如：int var = 10;
 *
 */
public class VariableTest {

    public static void main(String[] args) {

        // 变量的定义
        int myNum = 1001;
        // 变量的使用
        System.out.println(myNum);

    }


}
