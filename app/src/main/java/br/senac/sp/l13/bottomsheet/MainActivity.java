package br.senac.sp.l13.bottomsheet;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout bottomsheetlayout;
    private BottomSheetBehavior bottomsheetbehavior;
    private ImageView imageshared;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomsheetlayout = (LinearLayout) findViewById(R.id.bottomsheet);

        imageshared = (ImageView) findViewById(R.id.sharedImg);

        bottomsheetbehavior = BottomSheetBehavior.from(bottomsheetlayout);

        //estado de hidden

        // bottomsheetbehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

        //estado de collapsed

        //bottomsheetbehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

        //estado de expanded

        // bottomsheetbehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

        imageshared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomsheetbehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });
    }
}
