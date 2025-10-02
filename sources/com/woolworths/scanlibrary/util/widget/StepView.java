package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.woolworths.R;
import timber.log.Timber;

/* loaded from: classes7.dex */
public class StepView extends LinearLayout {
    public StepProgress d;
    public String e;
    public int f;
    public boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StepProgress {
        public static final StepProgress d;
        public static final StepProgress e;
        public static final StepProgress f;
        public static final /* synthetic */ StepProgress[] g;

        static {
            StepProgress stepProgress = new StepProgress("PENDING", 0);
            d = stepProgress;
            StepProgress stepProgress2 = new StepProgress("IN_PROGRESS", 1);
            e = stepProgress2;
            StepProgress stepProgress3 = new StepProgress("COMPLETE", 2);
            f = stepProgress3;
            g = new StepProgress[]{stepProgress, stepProgress2, stepProgress3};
        }

        public static StepProgress valueOf(String str) {
            return (StepProgress) Enum.valueOf(StepProgress.class, str);
        }

        public static StepProgress[] values() {
            return (StepProgress[]) g.clone();
        }
    }

    public StepView(Context context) {
        super(context);
        a(context);
    }

    public final void a(Context context) {
        setGravity(16);
        setOrientation(0);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            Timber.f27013a.o("Inflater step view is null", new Object[0]);
            return;
        }
        View viewInflate = layoutInflater.inflate(R.layout.custom_step_view, (ViewGroup) this, true);
        TextView textView = (TextView) viewInflate.findViewById(R.id.stageNumber);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.stageName);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.completedIcon);
        CircleView circleView = (CircleView) viewInflate.findViewById(R.id.progressCircle);
        textView.setText(String.valueOf(this.f));
        textView.setVisibility(0);
        imageView.setVisibility(8);
        textView2.setText(this.e);
        textView2.setTypeface(null, 0);
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            circleView.setColor(R.color.sng_progress_circle_pending_stage);
            return;
        }
        if (iOrdinal == 1) {
            circleView.setColor(R.color.sng_progress_circle_in_progress_stage);
            textView2.setTypeface(null, 1);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            circleView.setVisibility(8);
            textView.setVisibility(8);
            imageView.setVisibility(0);
            if (this.g) {
                ((Animatable) imageView.getDrawable()).start();
            } else {
                imageView.setImageResource(R.drawable.sng_ic_check_circle_black_24dp);
            }
        }
    }

    public StepView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.woolworths.scanlibrary.R.styleable.e, 0, 0);
        this.e = typedArrayObtainStyledAttributes.getString(5);
        this.f = typedArrayObtainStyledAttributes.getInt(6, 0);
        typedArrayObtainStyledAttributes.getColor(2, getResources().getColor(R.color.sng_progress_step_pending_stage));
        typedArrayObtainStyledAttributes.getColor(0, getResources().getColor(R.color.sng_progress_step_complete_stage));
        typedArrayObtainStyledAttributes.getColor(1, getResources().getColor(R.color.sng_progress_step_in_progress_stage));
        int i = typedArrayObtainStyledAttributes.getInt(3, 0);
        if (i >= 0 && i < StepProgress.values().length) {
            this.d = StepProgress.values()[i];
        }
        a(context);
    }
}
