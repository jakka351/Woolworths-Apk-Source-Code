package au.com.woolworths.feature.shared.feedback;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shared.feedback.databinding.ActivityFeedbackFormBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f6475a;

    public static class InnerBrLookup {
        static {
            new SparseArray(1).put(0, "_all");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f6476a;

        static {
            HashMap map = new HashMap(1);
            f6476a = map;
            map.put("layout/activity_feedback_form_0", Integer.valueOf(com.woolworths.R.layout.activity_feedback_form));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f6475a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_feedback_form, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f6475a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 1) {
                if (!"layout/activity_feedback_form_0".equals(tag)) {
                    throw new IllegalArgumentException(b.m(tag, "The tag for activity_feedback_form is invalid. Received: "));
                }
                Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, ActivityFeedbackFormBindingImpl.A);
                ActivityFeedbackFormBindingImpl activityFeedbackFormBindingImpl = new ActivityFeedbackFormBindingImpl(dataBindingComponent, view, (Toolbar) objArrT[2]);
                activityFeedbackFormBindingImpl.z = -1L;
                ((ConstraintLayout) objArrT[0]).setTag(null);
                activityFeedbackFormBindingImpl.E(view);
                activityFeedbackFormBindingImpl.r();
                return activityFeedbackFormBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f6475a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f6476a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
