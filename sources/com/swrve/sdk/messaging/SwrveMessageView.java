package com.swrve.sdk.messaging;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.p;
import com.swrve.sdk.SwrveImageScaler;
import com.swrve.sdk.SwrveLogger;
import com.swrve.sdk.config.SwrveConfigBase;
import com.swrve.sdk.config.SwrveInAppMessageConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class SwrveMessageView extends RelativeLayout {
    public static final /* synthetic */ int m = 0;
    public final SwrveMessage d;
    public final SwrveMessageFormat e;
    public final SwrveMessagePage f;
    public float g;
    public final int h;
    public final SwrveInAppMessageConfig i;
    public final Map j;
    public final ArrayList k;
    public final WeakReference l;

    /* renamed from: com.swrve.sdk.messaging.SwrveMessageView$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator<SwrveWidget> {
        @Override // java.util.Comparator
        public final int compare(SwrveWidget swrveWidget, SwrveWidget swrveWidget2) {
            return Integer.compare(swrveWidget.c(), swrveWidget2.c());
        }
    }

    public SwrveMessageView(Context context, SwrveConfigBase swrveConfigBase, SwrveMessage swrveMessage, SwrveMessageFormat swrveMessageFormat, Map map, long j, GestureDetector gestureDetector) throws SwrveMessageViewBuildException {
        super(context);
        this.h = 1;
        this.k = new ArrayList();
        this.d = swrveMessage;
        this.e = swrveMessageFormat;
        this.j = map;
        HashMap map2 = swrveMessageFormat.e;
        if (map2 != null && !map2.containsKey(Long.valueOf(j))) {
            a();
            return;
        }
        this.f = (SwrveMessagePage) swrveMessageFormat.e.get(Long.valueOf(j));
        if (gestureDetector != null) {
            this.l = new WeakReference(gestureDetector);
        }
        swrveConfigBase.getClass();
        this.i = swrveConfigBase.g;
        this.k = new ArrayList();
        try {
            d();
        } catch (Exception e) {
            SwrveLogger.c("Error while initializing SwrveMessageView layout", e, new Object[0]);
            this.k.add("Error while initializing SwrveMessageView layout:" + e.getMessage());
            a();
        } catch (OutOfMemoryError e2) {
            SwrveLogger.c("OutOfMemoryError while initializing SwrveMessageView layout", e2, new Object[0]);
            this.k.add("OutOfMemoryError while initializing SwrveMessageView layout:" + e2.getMessage());
            a();
        }
        if (this.k.size() <= 0) {
            return;
        }
        new HashMap().put("reason", this.k.toString());
        a();
        throw new SwrveMessageViewBuildException("There was an error creating the view caused by:\n" + this.k.toString());
    }

    public static RelativeLayout.LayoutParams c(SwrveWidget swrveWidget, SwrveImageFileInfo swrveImageFileInfo) {
        SwrveImageScaler.BitmapResult bitmapResult = swrveImageFileInfo.d;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(bitmapResult.b, bitmapResult.c);
        layoutParams.leftMargin = swrveWidget.d().x;
        layoutParams.topMargin = swrveWidget.d().y;
        if (swrveImageFileInfo.b) {
            layoutParams.width = swrveWidget.e().x;
            layoutParams.height = swrveWidget.e().y;
            return layoutParams;
        }
        layoutParams.width = bitmapResult.b;
        layoutParams.height = bitmapResult.c;
        return layoutParams;
    }

    @SuppressLint
    private View.OnTouchListener getGestureOnTouchListener() {
        return new p(this, 2);
    }

    private List<SwrveWidget> getPageElements() {
        ArrayList arrayList = new ArrayList();
        SwrveMessagePage swrveMessagePage = this.f;
        arrayList.addAll(swrveMessagePage.b);
        arrayList.addAll(swrveMessagePage.f19101a);
        Collections.sort(arrayList, new AnonymousClass1());
        return arrayList;
    }

    public final void a() {
        Context context = getContext();
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.swrve.sdk.messaging.SwrveImageFileInfo b(com.swrve.sdk.messaging.SwrveWidget r19, java.lang.String r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.messaging.SwrveMessageView.b(com.swrve.sdk.messaging.SwrveWidget, java.lang.String, int, int):com.swrve.sdk.messaging.SwrveImageFileInfo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05d6 A[LOOP:0: B:11:0x0078->B:191:0x05d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() throws com.swrve.sdk.exceptions.SwrveSDKTextTemplatingException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 1507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.messaging.SwrveMessageView.d():void");
    }

    @VisibleForTesting
    public SwrveMessageFormat getFormat() {
        return this.e;
    }

    @VisibleForTesting
    public SwrveMessagePage getPage() {
        return this.f;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            int childCount = getChildCount();
            int i5 = (int) (((i3 - i) / 2.0d) + i);
            int i6 = (int) (((i4 - i2) / 2.0d) + i2);
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) childAt.getLayoutParams();
                    int i8 = layoutParams.width / 2;
                    int i9 = layoutParams.height / 2;
                    float f = this.g;
                    if (f != 1.0f) {
                        int i10 = layoutParams.leftMargin;
                        int i11 = layoutParams.topMargin;
                        childAt.layout(((int) ((i10 - i8) * f)) + i5, ((int) ((i11 - i9) * f)) + i6, ((int) ((i10 + i8) * f)) + i5, ((int) (f * (i11 + i9))) + i6);
                    } else {
                        int i12 = layoutParams.leftMargin;
                        int i13 = layoutParams.topMargin;
                        childAt.layout((i12 - i8) + i5, (i13 - i9) + i6, i12 + i8 + i5, i13 + i9 + i6);
                    }
                }
            }
        } catch (Exception e) {
            SwrveLogger.c("Error while onLayout in SwrveMessageView", e, new Object[0]);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
