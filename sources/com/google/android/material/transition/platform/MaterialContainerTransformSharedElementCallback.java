package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.google.android.material.internal.ContextUtils;
import com.woolworths.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@RequiresApi
/* loaded from: classes6.dex */
public class MaterialContainerTransformSharedElementCallback extends SharedElementCallback {
    public static WeakReference b;

    /* renamed from: a, reason: collision with root package name */
    public Rect f14700a;

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$1, reason: invalid class name */
    class AnonymousClass1 extends TransitionListenerAdapter {
        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            throw null;
        }

        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            throw null;
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$3, reason: invalid class name */
    class AnonymousClass3 extends TransitionListenerAdapter {
        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            throw null;
        }
    }

    public interface ShapeProvider {
    }

    public static class ShapeableViewShapeProvider implements ShapeProvider {
    }

    @Override // android.app.SharedElementCallback
    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        b = new WeakReference(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    public final void onMapSharedElements(List list, Map map) {
        View view;
        final Activity activityA;
        if (list.isEmpty() || map.isEmpty() || (view = (View) map.get(list.get(0))) == null || (activityA = ContextUtils.a(view.getContext())) == null) {
            return;
        }
        Transition sharedElementReturnTransition = activityA.getWindow().getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof MaterialContainerTransform) {
            ((MaterialContainerTransform) sharedElementReturnTransition).addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.2
                @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition) {
                    View view2;
                    WeakReference weakReference = MaterialContainerTransformSharedElementCallback.b;
                    if (weakReference != null && (view2 = (View) weakReference.get()) != null) {
                        view2.setAlpha(1.0f);
                        MaterialContainerTransformSharedElementCallback.b = null;
                    }
                    Activity activity = activityA;
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                }
            });
        }
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementEnd(List list, List list2, List list3) {
        if (!list2.isEmpty() && (((View) list2.get(0)).getTag(R.id.mtrl_motion_snapshot_view) instanceof View)) {
            ((View) list2.get(0)).setTag(R.id.mtrl_motion_snapshot_view, null);
        }
        if (list2.isEmpty()) {
            return;
        }
        View view = (View) list2.get(0);
        RectF rectF = TransitionUtils.f14702a;
        this.f14700a = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementStart(List list, List list2, List list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            ((View) list2.get(0)).setTag(R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (list2.isEmpty() || this.f14700a == null) {
            return;
        }
        View view = (View) list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f14700a.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f14700a.height(), 1073741824));
        Rect rect = this.f14700a;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }
}
