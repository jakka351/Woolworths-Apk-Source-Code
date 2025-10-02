package com.swrve.sdk;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.EdgeToEdge;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.salesforce.marketingcloud.storage.db.k;
import com.swrve.sdk.config.SwrveConfigBase;
import com.swrve.sdk.config.SwrveInAppMessageConfig;
import com.swrve.sdk.messaging.SwrveActionType;
import com.swrve.sdk.messaging.SwrveButton;
import com.swrve.sdk.messaging.SwrveInAppCampaign;
import com.swrve.sdk.messaging.SwrveInAppMessageFragment;
import com.swrve.sdk.messaging.SwrveInAppStoryButton;
import com.swrve.sdk.messaging.SwrveInAppStoryView;
import com.swrve.sdk.messaging.SwrveMessage;
import com.swrve.sdk.messaging.SwrveMessageFormat;
import com.swrve.sdk.messaging.SwrveMessagePage;
import com.swrve.sdk.messaging.SwrveOrientation;
import com.swrve.sdk.messaging.SwrveStoryDismissButton;
import com.swrve.sdk.messaging.SwrveStorySettings;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes6.dex */
public class SwrveInAppMessageActivity extends FragmentActivity {
    public static final /* synthetic */ int C = 0;
    public SwrveInAppStoryView.SwrveInAppStorySegmentListener A;
    public GestureDetector B;
    public InAppMessageHandler t;
    public SwrveBase u;
    public ViewPager2 v;
    public ScreenSlidePagerAdapter w;
    public boolean x;
    public long y;
    public SwrveInAppStoryView z;

    /* renamed from: com.swrve.sdk.SwrveInAppMessageActivity$1, reason: invalid class name */
    class AnonymousClass1 implements SwrveInAppStoryView.SwrveInAppStorySegmentListener {
        public AnonymousClass1() {
        }

        @Override // com.swrve.sdk.messaging.SwrveInAppStoryView.SwrveInAppStorySegmentListener
        public final void a(final int i) {
            SwrveInAppMessageActivity.this.runOnUiThread(new Runnable() { // from class: com.swrve.sdk.u
                @Override // java.lang.Runnable
                public final void run() {
                    SwrveInAppMessageActivity.N4(SwrveInAppMessageActivity.this, i + 1);
                }
            });
        }
    }

    public class InAppStoryGestureListener extends GestureDetector.SimpleOnGestureListener {
        public int d;
        public final FrameLayout e;

        public InAppStoryGestureListener(FrameLayout frameLayout) {
            this.e = frameLayout;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            SwrveInAppMessageActivity swrveInAppMessageActivity = SwrveInAppMessageActivity.this;
            if (swrveInAppMessageActivity.A != null) {
                if (motionEvent.getRawX() > this.e.getWidth() - this.d) {
                    if (swrveInAppMessageActivity.z.getCurrentIndex() < swrveInAppMessageActivity.z.getNumberOfSegments() - 1) {
                        SwrveInAppMessageActivity.N4(swrveInAppMessageActivity, swrveInAppMessageActivity.z.getCurrentIndex() + 1);
                        return true;
                    }
                } else if (motionEvent.getRawX() < this.d) {
                    if (swrveInAppMessageActivity.z.getCurrentIndex() > 0) {
                        SwrveInAppMessageActivity.N4(swrveInAppMessageActivity, swrveInAppMessageActivity.z.getCurrentIndex() - 1);
                    }
                }
                return true;
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
    }

    public class ScreenSlidePagerAdapter extends FragmentStateAdapter {
        public final LinkedList p;

        public ScreenSlidePagerAdapter(SwrveInAppMessageActivity swrveInAppMessageActivity, LinkedList linkedList) {
            super(swrveInAppMessageActivity);
            this.p = linkedList;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public final Fragment I(int i) {
            long jLongValue = ((Long) this.p.get(i)).longValue();
            Bundle bundle = new Bundle();
            bundle.putLong("PAGE_ID", jLongValue);
            SwrveInAppMessageFragment swrveInAppMessageFragment = new SwrveInAppMessageFragment();
            swrveInAppMessageFragment.setArguments(bundle);
            return swrveInAppMessageFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int i() {
            return this.p.size();
        }
    }

    public static void N4(SwrveInAppMessageActivity swrveInAppMessageActivity, int i) {
        ArrayList arrayList = swrveInAppMessageActivity.t.f.f;
        long jLongValue = arrayList.size() > i ? ((Long) arrayList.get(i)).longValue() : 0L;
        if (jLongValue != 0) {
            swrveInAppMessageActivity.U4(jLongValue);
            return;
        }
        SwrveStorySettings swrveStorySettings = swrveInAppMessageActivity.t.f.j;
        SwrveStorySettings.LastPageProgression lastPageProgression = swrveStorySettings.b;
        if (lastPageProgression == SwrveStorySettings.LastPageProgression.d) {
            SwrveLogger.b("Last page progression is dismiss, so dismissing", new Object[0]);
            swrveInAppMessageActivity.t.e(swrveInAppMessageActivity.y, swrveStorySettings.l, swrveStorySettings.m);
            swrveInAppMessageActivity.finish();
        } else if (lastPageProgression == SwrveStorySettings.LastPageProgression.f) {
            SwrveLogger.b("Last page progression is loop, so restarting the story", new Object[0]);
            swrveInAppMessageActivity.U4(swrveInAppMessageActivity.t.f.k);
        } else if (lastPageProgression == SwrveStorySettings.LastPageProgression.e) {
            SwrveLogger.b("Last page progression is stop, so remain on last page", new Object[0]);
        }
    }

    public final void O4(SwrveButton swrveButton, String str, long j, String str2) {
        try {
            this.t.c(swrveButton, str, j, str2);
            if (swrveButton.z == SwrveActionType.i) {
                U4(Long.parseLong(swrveButton.x));
            } else {
                finish();
            }
        } catch (Exception e) {
            SwrveLogger.c("Error in IAM onClick button listener.", e, new Object[0]);
        }
    }

    public final Map P4() {
        return this.t.d;
    }

    public final SwrveMessage Q4() {
        return this.t.e;
    }

    public final SwrveMessageFormat R4() {
        return this.t.f;
    }

    public final void S4() throws Resources.NotFoundException {
        SwrveMessageFormat swrveMessageFormat = this.t.f;
        long j = swrveMessageFormat.k;
        HashMap map = swrveMessageFormat.e;
        SwrveMessagePage swrveMessagePage = (SwrveMessagePage) map.get(Long.valueOf(j));
        LinkedList linkedList = new LinkedList();
        if (map.size() == 1 || swrveMessagePage.e == -1) {
            SwrveLogger.g("SwrveInAppMessageActivity: non swipe page flow", new Object[0]);
            this.x = false;
        } else {
            SwrveLogger.g("SwrveInAppMessageActivity: swipeable multi page flow. Traversing tree to get trunk and check for circular flows", new Object[0]);
            this.x = true;
            while (true) {
                long j2 = swrveMessagePage.d;
                long j3 = swrveMessagePage.e;
                linkedList.add(Long.valueOf(j2));
                if (j3 == -1) {
                    break;
                } else {
                    if (linkedList.contains(Long.valueOf(j3))) {
                        throw new IllegalArgumentException("SwrveInAppMessageActivity: Circular loops not supported in swipeable flow.");
                    }
                    swrveMessagePage = (SwrveMessagePage) map.get(Long.valueOf(j3));
                }
            }
        }
        SwrveStorySettings swrveStorySettings = this.t.f.j;
        if (swrveStorySettings != null) {
            int i = swrveStorySettings.d;
            int i2 = swrveStorySettings.c;
            int i3 = swrveStorySettings.h;
            SwrveStoryDismissButton swrveStoryDismissButton = swrveStorySettings.k;
            if (this.A == null) {
                this.A = new AnonymousClass1();
            }
            SwrveInAppStoryView.SwrveInAppStorySegmentListener swrveInAppStorySegmentListener = this.A;
            FrameLayout frameLayout = (FrameLayout) findViewById(com.woolworths.R.id.swrve_iam_pager_container);
            int size = this.t.f.e.size();
            ArrayList arrayList = this.t.f.g;
            SwrveInAppStoryView swrveInAppStoryView = new SwrveInAppStoryView(this);
            swrveInAppStoryView.d = 1;
            swrveInAppStoryView.e = 0;
            swrveInAppStoryView.f = BitmapDescriptorFactory.HUE_RED;
            swrveInAppStoryView.l = 0;
            swrveInAppStoryView.m = 0;
            swrveInAppStoryView.q = null;
            swrveInAppStoryView.s = new WeakReference(null);
            swrveInAppStoryView.setListener(swrveInAppStorySegmentListener);
            swrveInAppStoryView.d = size;
            swrveInAppStoryView.r = arrayList;
            swrveInAppStoryView.j = Color.parseColor(swrveStorySettings.f);
            swrveInAppStoryView.k = Color.parseColor(swrveStorySettings.g);
            int i4 = swrveStorySettings.f19103a;
            if (i4 > 0) {
                swrveInAppStoryView.h = i4;
            }
            if (i3 > 0) {
                swrveInAppStoryView.i = i3;
            }
            int i5 = swrveStorySettings.i;
            if (i5 > 0) {
                swrveInAppStoryView.g = i5;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            layoutParams.topMargin = i2;
            layoutParams.leftMargin = swrveStorySettings.e;
            layoutParams.rightMargin = i;
            swrveInAppStoryView.setLayoutParams(layoutParams);
            ViewCompat.I(swrveInAppStoryView, new au.com.woolworths.product.details.epoxy.a(swrveInAppStoryView, 27));
            this.z = swrveInAppStoryView;
            frameLayout.addView(swrveInAppStoryView);
            if (swrveStorySettings.j) {
                final InAppStoryGestureListener inAppStoryGestureListener = new InAppStoryGestureListener(frameLayout);
                this.B = new GestureDetector(this, inAppStoryGestureListener);
                this.z.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.swrve.sdk.s
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                        int i14 = SwrveInAppMessageActivity.C;
                        inAppStoryGestureListener.d = (i8 - i6) / 2;
                    }
                });
            }
            if (swrveStoryDismissButton != null) {
                Point point = new Point(i, i2 + i3 + swrveStoryDismissButton.g);
                this.u.getConfig().g.getClass();
                this.u.getConfig().g.getClass();
                SwrveInAppStoryButton swrveInAppStoryButton = new SwrveInAppStoryButton(this);
                swrveInAppStoryButton.setFocusable(true);
                swrveInAppStoryButton.setClickable(true);
                int i6 = swrveStoryDismissButton.f;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i6, i6);
                layoutParams2.gravity = 53;
                layoutParams2.rightMargin = point.x;
                layoutParams2.topMargin = point.y;
                swrveInAppStoryButton.setLayoutParams(layoutParams2);
                swrveInAppStoryButton.setContentDescription(swrveStoryDismissButton.h);
                int color = Color.parseColor(swrveStoryDismissButton.c);
                String str = swrveStoryDismissButton.e;
                int color2 = str == null ? color : Color.parseColor(str);
                int color3 = Color.parseColor(swrveStoryDismissButton.d);
                Drawable drawable = swrveInAppStoryButton.getResources().getDrawable(com.woolworths.R.drawable.swrve_x_xml);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, drawable);
                stateListDrawable.addState(new int[]{android.R.attr.state_focused}, drawable);
                stateListDrawable.addState(new int[0], drawable);
                swrveInAppStoryButton.setBackgroundDrawable(stateListDrawable);
                swrveInAppStoryButton.setBackgroundTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused}, new int[0]}, new int[]{color3, color2, color}));
                swrveInAppStoryButton.setBackgroundTintMode(PorterDuff.Mode.SRC_ATOP);
                swrveInAppStoryButton.setRippleColor(null);
                ViewCompat.I(swrveInAppStoryButton, new au.com.woolworths.product.details.epoxy.a(swrveInAppStoryButton, 26));
                frameLayout.addView(swrveInAppStoryButton);
                swrveInAppStoryButton.setOnClickListener(new View.OnClickListener() { // from class: com.swrve.sdk.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SwrveInAppMessageActivity swrveInAppMessageActivity = this.d;
                        int i7 = SwrveInAppMessageActivity.C;
                        Callback.g(view);
                        try {
                            InAppMessageHandler inAppMessageHandler = swrveInAppMessageActivity.t;
                            inAppMessageHandler.e(swrveInAppMessageActivity.y, r9.f19102a, inAppMessageHandler.f.j.k.b);
                            SwrveInAppStoryView swrveInAppStoryView2 = swrveInAppMessageActivity.z;
                            Thread thread = swrveInAppStoryView2.q;
                            if (thread != null) {
                                thread.interrupt();
                                swrveInAppStoryView2.q = null;
                            }
                            synchronized (swrveInAppStoryView2.s) {
                                swrveInAppStoryView2.s.clear();
                            }
                            swrveInAppMessageActivity.finish();
                            Callback.h();
                        } catch (Throwable th) {
                            Callback.h();
                            throw th;
                        }
                    }
                });
            }
        }
        if (this.x) {
            findViewById(com.woolworths.R.id.swrve_iam_frag_container).setVisibility(8);
            findViewById(com.woolworths.R.id.swrve_iam_pager).setVisibility(0);
            ViewPager2 viewPager2 = (ViewPager2) findViewById(com.woolworths.R.id.swrve_iam_pager);
            this.v = viewPager2;
            viewPager2.setOffscreenPageLimit(map.size());
            ScreenSlidePagerAdapter screenSlidePagerAdapter = new ScreenSlidePagerAdapter(this, linkedList);
            this.w = screenSlidePagerAdapter;
            this.v.setAdapter(screenSlidePagerAdapter);
        } else {
            findViewById(com.woolworths.R.id.swrve_iam_frag_container).setVisibility(0);
            findViewById(com.woolworths.R.id.swrve_iam_pager).setVisibility(8);
        }
        InAppMessageHandler inAppMessageHandler = this.t;
        Bundle bundle = inAppMessageHandler.c;
        U4((bundle == null || !bundle.containsKey("CURRENT_PAGE_ID")) ? inAppMessageHandler.f.k : bundle.getLong("CURRENT_PAGE_ID"));
    }

    public final void T4(long j) {
        InAppMessageHandler inAppMessageHandler = this.t;
        SwrveBase swrveBase = inAppMessageHandler.f19034a;
        SwrveMessage swrveMessage = inAppMessageHandler.e;
        SwrveInAppMessageActivity swrveInAppMessageActivity = inAppMessageHandler.b;
        ArrayList arrayList = inAppMessageHandler.h;
        if (arrayList.contains(Long.valueOf(j))) {
            SwrveLogger.g("SwrveSDK: Page view event for page_id %s already sent.", Long.valueOf(j));
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strValueOf = String.valueOf(swrveMessage.f19098a);
            String strValueOf2 = String.valueOf(j);
            HashMap map = new HashMap();
            String str = ((SwrveMessagePage) inAppMessageHandler.f.e.get(Long.valueOf(j))).c;
            if (SwrveHelper.o(str)) {
                map.put("pageName", str);
            }
            int i = Swrve.r0;
            map.put(k.a.b, SwrveHelper.k(swrveInAppMessageActivity));
            map.put("deviceType", SwrveHelper.j(swrveInAppMessageActivity));
            swrveBase.f(swrveInAppMessageActivity, swrveBase.getUserId(), EventHelper.a(jCurrentTimeMillis, strValueOf, "iam", "page_view", strValueOf2, "", map, swrveBase.p()));
            arrayList.add(Long.valueOf(j));
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK: Could not send page view event for id:%s", e, String.valueOf(swrveMessage.f19098a));
        }
    }

    public final void U4(long j) {
        if (this.x) {
            int iIndexOf = this.w.p.indexOf(Long.valueOf(j));
            if (iIndexOf != -1) {
                this.v.e(iIndexOf, false);
                return;
            } else {
                SwrveLogger.d("SwrveInAppMessageActivity: cannot show %s because it is not on the main swipeable trunk.", Long.valueOf(j));
                finish();
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("PAGE_ID", j);
        SwrveInAppMessageFragment swrveInAppMessageFragment = new SwrveInAppMessageFragment();
        swrveInAppMessageFragment.setArguments(bundle);
        GestureDetector gestureDetector = this.B;
        if (gestureDetector != null) {
            swrveInAppMessageFragment.e = gestureDetector;
        }
        if (isFinishing() || isDestroyed()) {
            SwrveLogger.h("SwrveInAppMessageActivity: cannot show page %s because activity is finishing or destroyed.", Long.valueOf(j));
            return;
        }
        FragmentTransaction fragmentTransactionE = getSupportFragmentManager().e();
        fragmentTransactionE.j(com.woolworths.R.id.swrve_iam_frag_container, swrveInAppMessageFragment, null);
        fragmentTransactionE.d();
        this.y = j;
        SwrveInAppStoryView swrveInAppStoryView = this.z;
        if (swrveInAppStoryView != null) {
            int iIndexOf2 = this.t.f.f.indexOf(Long.valueOf(j));
            Thread thread = swrveInAppStoryView.q;
            if (thread != null) {
                thread.interrupt();
                swrveInAppStoryView.q = null;
            }
            swrveInAppStoryView.e = iIndexOf2;
            swrveInAppStoryView.f = BitmapDescriptorFactory.HUE_RED;
            swrveInAppStoryView.a();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (!this.x) {
            this.t.b(this.y);
        } else {
            this.t.b(((Long) this.w.p.get(this.v.getCurrentItem())).longValue());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT < 35) {
            int i = EdgeToEdge.f53a;
            EdgeToEdge.b(this);
        }
        super.onCreate(bundle);
        InAppMessageHandler inAppMessageHandler = new InAppMessageHandler(this, getIntent(), bundle);
        this.t = inAppMessageHandler;
        SwrveMessage swrveMessage = inAppMessageHandler.e;
        if (swrveMessage == null) {
            finish();
            return;
        }
        SwrveBase swrveBase = (SwrveBase) SwrveSDKBase.f19075a;
        this.u = swrveBase;
        if (swrveBase == null) {
            finish();
            return;
        }
        SwrveMessageFormat swrveMessageFormat = inAppMessageHandler.f;
        if (swrveMessage.e.size() == 1) {
            try {
                if (swrveMessageFormat.c == SwrveOrientation.e) {
                    setRequestedOrientation(11);
                } else {
                    setRequestedOrientation(12);
                }
            } catch (RuntimeException e) {
                SwrveLogger.c("SwrveInAppMessageActivity: Bugs with setRequestedOrientation can happen: https://issuetracker.google.com/issues/68454482", e, new Object[0]);
            }
        }
        SwrveConfigBase config = this.u.getConfig();
        setContentView(com.woolworths.R.layout.swrve_frag_iam);
        try {
            S4();
        } catch (Exception e2) {
            SwrveLogger.c("Exception setting up IAM page(s) ", e2, new Object[0]);
            finish();
        }
        if (bundle == null) {
            InAppMessageHandler inAppMessageHandler2 = this.t;
            SwrveMessageFormat swrveMessageFormat2 = inAppMessageHandler2.f;
            SwrveBase swrveBase2 = inAppMessageHandler2.f19034a;
            if (swrveMessageFormat2 == null) {
                swrveBase2.getClass();
            } else {
                SwrveCampaignDisplayer swrveCampaignDisplayer = swrveBase2.C;
                swrveCampaignDisplayer.d = SwrveHelper.b(new Date(), swrveCampaignDisplayer.e, 13);
                swrveBase2.C.f--;
                SwrveMessage swrveMessage2 = swrveMessageFormat2.h;
                swrveMessage2.d.p();
                swrveBase2.O0(swrveMessage2.f19098a, "false");
                SwrveInAppMessageConfig swrveInAppMessageConfig = swrveBase2.l.g;
            }
        }
        config.g.getClass();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        SwrveInAppCampaign swrveInAppCampaign;
        super.onDestroy();
        SwrveMessage swrveMessage = this.t.e;
        if (swrveMessage == null || (swrveInAppCampaign = swrveMessage.d) == null) {
            return;
        }
        swrveInAppCampaign.q();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        Thread thread;
        super.onPause();
        SwrveInAppStoryView swrveInAppStoryView = this.z;
        if (swrveInAppStoryView == null || (thread = swrveInAppStoryView.q) == null) {
            return;
        }
        thread.interrupt();
        swrveInAppStoryView.q = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        SwrveInAppStoryView swrveInAppStoryView = this.z;
        if (swrveInAppStoryView != null) {
            swrveInAppStoryView.a();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        long jLongValue = this.x ? ((Long) this.w.p.get(this.v.getCurrentItem())).longValue() : this.y;
        InAppMessageHandler inAppMessageHandler = this.t;
        ArrayList arrayList = inAppMessageHandler.h;
        bundle.putLong("CURRENT_PAGE_ID", jLongValue);
        ArrayList arrayList2 = inAppMessageHandler.g;
        long[] jArr = new long[arrayList2.size()];
        for (int i = 0; i < arrayList2.size(); i++) {
            jArr[i] = ((Long) arrayList2.get(i)).longValue();
        }
        bundle.putLongArray("SENT_NAVIGATION_EVENTS", jArr);
        long[] jArr2 = new long[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jArr2[i2] = ((Long) arrayList.get(i2)).longValue();
        }
        bundle.putLongArray("SENT_PAGEVIEW_EVENTS", jArr2);
    }
}
