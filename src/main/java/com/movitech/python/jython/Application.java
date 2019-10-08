package com.movitech.python.jython;

import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.util.PythonInterpreter;

public class Application {

    public static void main(String[] args) {

        PythonInterpreter pythonInterpreter = new PythonInterpreter();

        pythonInterpreter.exec("print('-'*10+'Python Code'+'-'*10)");

        pythonInterpreter.execfile("C:\\Users\\lenovo\\Desktop\\jythontest.py");

        PyFunction pyFunction = pythonInterpreter.get("testfun",PyFunction.class);
        pyFunction.__call__();

        PyFunction pyFunction_ab = pythonInterpreter.get("fun_ab",PyFunction.class);
        pyFunction_ab.__call__(new PyInteger(5),new PyInteger(8));

    }
}