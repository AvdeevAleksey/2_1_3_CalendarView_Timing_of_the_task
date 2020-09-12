package ru.avdeev.android.a2_1_3_calendarview_timing_of_the_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private Button buttonChooseStartDate;
    private Button buttonChooseEndDate;
    private Button buttonOk;
    private CalendarView calendarChooseStartDate;
    private CalendarView calendarChooseEndDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonChooseStartDate = findViewById(R.id.btnChooseStartDate);
        buttonChooseEndDate = findViewById(R.id.btnChooseEndDate);
        buttonOk = findViewById(R.id.btnOk);
        calendarChooseStartDate = findViewById(R.id.startDateCalendar);
        calendarChooseEndDate = findViewById(R.id.endDateCalendar);

        calendarChooseStartDate.setVisibility(View.GONE);
        calendarChooseEndDate.setVisibility(View.GONE);
    }

    public void btnOkClocked (View view) {

    }

    public void btnChooseStartDateClicked (View view) {
        calendarChooseStartDate.setVisibility(View.VISIBLE);
        calendarChooseEndDate.setVisibility(View.GONE);
    }

    public void btnChooseEndDateClicked (View view) {
        calendarChooseEndDate.setVisibility(View.VISIBLE);
        calendarChooseStartDate.setVisibility(View.GONE);
    }
}