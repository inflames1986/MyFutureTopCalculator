package com.inflames1986.myfuturetopcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /**
     * поле содержит вычисления
     */
    private EditText compute;

    /**
     * поле содержит результат
     */
    private EditText result;

    /**
     * содержит формулу
     */
    private String formulaHolder;

    /**
     * содержит текущий результат вычисления
     */
    private String currentResult;

    /**
     * выбрана ли операция
     */
    private boolean isOperatorTriggered;

    /**
     * присваивает оператор
     */
    private String operator;

    /**
     * первое введенное число
     */
    private List<String> firstHolder;


    /**
     * второе введенное число
     */
    private List<String> secondHolder;

    /**
     * кнопки
     */
    private Button key0;
    private Button key1;
    private Button key2;
    private Button key3;
    private Button key4;
    private Button key5;
    private Button key6;
    private Button key7;
    private Button key8;
    private Button key9;
    private Button keyDiv;
    private Button keyMult;
    private Button keyMinus;
    private Button keyPlus;
    private Button keyResult;
    private Button keyDot;
    private Button keyClear;

    private static int computedResult(List<String> listOne, List<String> listTwo, String operator) {
        int sumFirstHolder = 0;
        int sumSecondHolder = 0;
        int result = 0;

        for (int i = 0; i < listOne.size(); i++) {
            sumFirstHolder += Integer.parseInt(listOne.get(i));
        }

        for (int i = 0; i < listTwo.size(); i++) {
            sumSecondHolder += Integer.parseInt(listTwo.get(i));
        }

        switch (operator) {
            case "+":
                result = sumFirstHolder + sumSecondHolder;
                break;
            case "-":
                result = sumFirstHolder - sumSecondHolder;
                break;
            case "*":
                result = sumFirstHolder * sumSecondHolder;
                break;
            case "/":
                result = sumFirstHolder / sumSecondHolder;
                break;
        }
        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_constraint_for_calc);


        this.formulaHolder = "";
        this.currentResult = "";
        this.isOperatorTriggered = false;
        this.firstHolder = new ArrayList<>();
        this.secondHolder = new ArrayList<>();

        findByIds();

        key0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("0");
                    formulaHolder = formulaHolder + "0";
                } else {
                    secondHolder.add("0");
                    formulaHolder = formulaHolder + "0";
                }
                displayFormula(formulaHolder);
            }
        });

        key1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {

                    firstHolder.add("1");
                    formulaHolder = formulaHolder + "1";
                } else {
                    secondHolder.add("1");
                    formulaHolder = formulaHolder + "1";
                }
                displayFormula(formulaHolder);
            }
        });

        key2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("2");
                    formulaHolder = formulaHolder + "2";
                } else {
                    secondHolder.add("2");
                    formulaHolder = formulaHolder + "2";
                }
                displayFormula(formulaHolder);
            }
        });

        key3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("3");
                    formulaHolder = formulaHolder + "3";
                } else {
                    secondHolder.add("3");
                    formulaHolder = formulaHolder + "3";
                }
                displayFormula(formulaHolder);
            }
        });

        key4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("4");
                    formulaHolder = formulaHolder + "4";
                } else {
                    secondHolder.add("4");
                    formulaHolder = formulaHolder + "4";
                }
                displayFormula(formulaHolder);
            }
        });

        key5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("5");
                    formulaHolder = formulaHolder + "5";
                } else {
                    secondHolder.add("5");
                    formulaHolder = formulaHolder + "5";
                }
                displayFormula(formulaHolder);
            }
        });

        key6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("6");
                    formulaHolder = formulaHolder + "6";
                } else {
                    secondHolder.add("6");
                    formulaHolder = formulaHolder + "6";
                }
                displayFormula(formulaHolder);
            }
        });

        key7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("7");
                    formulaHolder = formulaHolder + "7";
                } else {
                    secondHolder.add("7");
                    formulaHolder = formulaHolder + "7";
                }
                displayFormula(formulaHolder);
            }
        });

        key8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("8");
                    formulaHolder = formulaHolder + "8";
                } else {
                    secondHolder.add("8");
                    formulaHolder = formulaHolder + "8";
                }
                displayFormula(formulaHolder);
            }
        });

        key9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    firstHolder.add("9");
                    formulaHolder = formulaHolder + "9";
                } else {
                    secondHolder.add("9");
                    formulaHolder = formulaHolder + "9";
                }
                displayFormula(formulaHolder);
            }
        });

        keyDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulaHolder = formulaHolder + ".";
                displayFormula(formulaHolder);
            }
        });

        keyDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isOperatorTriggered) {
                    operator = "/";
                    formulaHolder = formulaHolder + "/";
                    isOperatorTriggered = true;
                }
                displayFormula(formulaHolder);
            }
        });

        keyMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isOperatorTriggered) {
                    operator = "*";
                    isOperatorTriggered = true;
                    formulaHolder = formulaHolder + "*";
                }
                displayFormula(formulaHolder);
            }
        });

        keyMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isOperatorTriggered) {
                    operator = "-";
                    isOperatorTriggered = true;
                    formulaHolder = formulaHolder + "-";
                }
                displayFormula(formulaHolder);
            }
        });

        keyPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isOperatorTriggered) {
                    operator = "+";
                    isOperatorTriggered = true;
                    formulaHolder = formulaHolder + "+";
                }
                displayFormula(formulaHolder);
            }
        });

        keyResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int finalResult = computedResult(firstHolder, secondHolder, operator);
                displayResult(Integer.toString(finalResult));
            }
        });

        keyClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperatorTriggered) {
                    formulaHolder = null;
                }
                displayFormula(formulaHolder);
            }
        });

    }

    private void findByIds() {
        this.compute = findViewById(R.id.compute);
        this.result = findViewById(R.id.result);
        this.key0 = findViewById(R.id.key_0);
        this.key1 = findViewById(R.id.key_1);
        this.key2 = findViewById(R.id.key_2);
        this.key3 = findViewById(R.id.key_3);
        this.key4 = findViewById(R.id.key_4);
        this.key5 = findViewById(R.id.key_5);
        this.key6 = findViewById(R.id.key_6);
        this.key7 = findViewById(R.id.key_7);
        this.key8 = findViewById(R.id.key_8);
        this.key9 = findViewById(R.id.key_9);
        this.keyDiv = findViewById(R.id.key_div);
        this.keyMinus = findViewById(R.id.key_minus);
        this.keyPlus = findViewById(R.id.key_plus);
        this.keyDot = findViewById(R.id.key_dot);
        this.keyMult = findViewById(R.id.key_mult);
        this.keyResult = findViewById(R.id.key_result);
        this.keyClear = findViewById(R.id.key_clear);
    }

    private void displayFormula(String number) {
        this.compute.setText(number);
    }

    private void displayResult(String result) {
        this.result.setText(result);
    }
}

