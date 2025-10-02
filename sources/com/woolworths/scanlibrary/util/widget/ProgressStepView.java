package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.woolworths.scanlibrary.R;
import com.woolworths.scanlibrary.util.widget.StepView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import timber.log.Timber;

/* loaded from: classes7.dex */
public class ProgressStepView extends LinearLayout {
    public final View d;
    public LinearLayout e;
    public final ArrayList f;

    public ProgressStepView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f = new ArrayList();
        for (CharSequence charSequence : context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.d, 0, 0).getTextArray(0)) {
            this.f.add(charSequence.toString());
        }
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            this.d = layoutInflater.inflate(com.woolworths.R.layout.custom_progress_step_view, (ViewGroup) this, true);
        } else {
            Timber.f27013a.o("Inflater progress step view is null", new Object[0]);
        }
        setStages(this.f);
    }

    public void setCurrentStage(int i) throws Resources.NotFoundException {
        this.e.removeAllViews();
        Iterator it = this.f.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            StepView.StepProgress stepProgress = i > i2 ? StepView.StepProgress.f : i == i2 ? StepView.StepProgress.e : StepView.StepProgress.d;
            Context context = getContext();
            int i3 = i2 + 1;
            boolean z = i + (-1) == i2;
            StepView stepView = new StepView(context);
            stepView.e = str;
            stepView.d = stepProgress;
            stepView.f = i3;
            stepView.g = z;
            stepView.getResources().getColor(com.woolworths.R.color.sng_progress_step_pending_stage);
            stepView.getResources().getColor(com.woolworths.R.color.sng_progress_step_complete_stage);
            stepView.getResources().getColor(com.woolworths.R.color.sng_progress_step_in_progress_stage);
            stepView.a(context);
            this.e.addView(stepView, i2);
            i2 = i3;
        }
        requestLayout();
    }

    public void setStages(List<String> list) throws Resources.NotFoundException {
        View view = this.d;
        if (view != null) {
            this.e = (LinearLayout) view.findViewById(com.woolworths.R.id.stagesLayout);
            setCurrentStage(0);
        } else {
            Timber.f27013a.o("Root view of the progress step view is null", new Object[0]);
        }
    }
}
