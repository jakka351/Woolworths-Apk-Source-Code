package com.adobe.mobile;

import YU.a;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import com.adobe.mobile.FloatingButton;
import com.adobe.mobile.Messages;
import com.adobe.mobile.StaticMethods;
import com.dynatrace.android.callback.Callback;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes4.dex */
class TargetPreviewManager implements FloatingButton.OnButtonDetachedFromWindowListener, FloatingButton.OnPositionChangedListener {
    public static TargetPreviewManager i;
    public static final Object j = new Object();
    public static final Object k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public String f13281a = null;
    public float b = -1.0f;
    public float c = -1.0f;
    public String d = null;
    public String e = null;
    public final Object f = new Object();
    public String g = null;
    public MessageTargetExperienceUIFullScreen h = null;

    public static TargetPreviewManager d() {
        TargetPreviewManager targetPreviewManager;
        synchronized (k) {
            try {
                if (i == null) {
                    i = new TargetPreviewManager();
                }
                targetPreviewManager = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return targetPreviewManager;
    }

    @Override // com.adobe.mobile.FloatingButton.OnPositionChangedListener
    public final void a(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // com.adobe.mobile.FloatingButton.OnButtonDetachedFromWindowListener
    public final void b(FloatingButton floatingButton) {
        float xCompat = floatingButton.getXCompat();
        float yCompat = floatingButton.getYCompat();
        this.b = xCompat;
        this.c = yCompat;
    }

    public final void c() {
        if (f() == null || f().isEmpty()) {
            StaticMethods.I("No Target Preview token setup!", new Object[0]);
        } else {
            StaticMethods.i().execute(new Runnable() { // from class: com.adobe.mobile.TargetPreviewManager.2

                /* renamed from: com.adobe.mobile.TargetPreviewManager$2$1, reason: invalid class name */
                class AnonymousClass1 implements Runnable {
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            Toast.makeText(StaticMethods.q(), "Could not download Target Preview UI. Please try again!", 0).show();
                        } catch (StaticMethods.NullActivityException e) {
                            StaticMethods.I("Could not show error message!(%s) ", e);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    String str;
                    TargetPreviewManager targetPreviewManagerD = TargetPreviewManager.d();
                    String str2 = targetPreviewManagerD.f13281a;
                    NetworkObject networkObjectC = RequestHandler.c(String.format(Locale.US, a.g((str2 == null || str2.isEmpty()) ? "https://hal.testandtarget.omniture.com" : targetPreviewManagerD.f13281a, "/ui/admin/%s/preview/?token=%s"), MobileConfig.b().o, StaticMethods.a(targetPreviewManagerD.f())), "GET", "text/html", null, null, MobileConfig.b().p, "Target Preview");
                    if (networkObjectC == null || networkObjectC.f13277a != 200 || (str = networkObjectC.b) == null) {
                        try {
                            StaticMethods.q().runOnUiThread(new AnonymousClass1());
                            return;
                        } catch (StaticMethods.NullActivityException e) {
                            StaticMethods.I("Could not show error message!(%s) ", e);
                            return;
                        }
                    }
                    TargetPreviewManager.this.g = str;
                    MobileConfig mobileConfigB = MobileConfig.b();
                    if (mobileConfigB.y == null) {
                        mobileConfigB.y = new ArrayList();
                    }
                    MessageTargetExperienceUIFullScreen messageTargetExperienceUIFullScreenE = TargetPreviewManager.d().e();
                    if (Messages.a(messageTargetExperienceUIFullScreenE.f13268a) == null) {
                        mobileConfigB.y.add(messageTargetExperienceUIFullScreenE);
                    }
                    StaticMethods.w().execute(new Messages.AnonymousClass4(androidx.constraintlayout.core.state.a.r("a.targetpreview.show", "true"), null, null));
                }
            });
        }
    }

    public final MessageTargetExperienceUIFullScreen e() {
        if (this.h == null) {
            MessageTargetExperienceUIFullScreen messageTargetExperienceUIFullScreen = new MessageTargetExperienceUIFullScreen();
            messageTargetExperienceUIFullScreen.w = false;
            messageTargetExperienceUIFullScreen.f13268a = "TargetPreview-" + UUID.randomUUID();
            messageTargetExperienceUIFullScreen.c = new Date(StaticMethods.E() * 1000);
            messageTargetExperienceUIFullScreen.r = this.g;
            messageTargetExperienceUIFullScreen.b = Messages.MessageShowRule.MESSAGE_SHOW_RULE_ALWAYS;
            messageTargetExperienceUIFullScreen.k = new ArrayList();
            MessageMatcherEquals messageMatcherEquals = new MessageMatcherEquals();
            messageMatcherEquals.f13271a = "a.targetpreview.show";
            ArrayList arrayList = new ArrayList();
            messageMatcherEquals.b = arrayList;
            arrayList.add("true");
            messageTargetExperienceUIFullScreen.k.add(messageMatcherEquals);
            messageTargetExperienceUIFullScreen.j = new ArrayList();
            this.h = messageTargetExperienceUIFullScreen;
        }
        return this.h;
    }

    public final String f() {
        String str;
        synchronized (j) {
            str = this.d;
        }
        return str;
    }

    public final void g() {
        if (f() == null) {
            int i2 = FloatingButton.k;
            try {
                StaticMethods.q().runOnUiThread(new FloatingButton.AnonymousClass2());
                return;
            } catch (Exception e) {
                StaticMethods.K("%s - error hiding the Target Preview button (%s)", "FloatingButton", e);
                return;
            }
        }
        synchronized (this) {
            try {
                Activity activityQ = StaticMethods.q();
                FloatingButton floatingButton = new FloatingButton(activityQ, this.b, this.c);
                floatingButton.setTag("ADBFloatingButtonTag");
                floatingButton.setOnClickListener(new View.OnClickListener() { // from class: com.adobe.mobile.TargetPreviewManager.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Callback.g(view);
                        try {
                            StaticMethods.i().execute(new Runnable() { // from class: com.adobe.mobile.TargetPreviewManager.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TargetPreviewManager.this.c();
                                }
                            });
                        } finally {
                            Callback.h();
                        }
                    }
                });
                floatingButton.b(activityQ, this, this);
            } catch (StaticMethods.NullActivityException e2) {
                StaticMethods.I("Target - Could not show the floating button (%s)", e2);
            }
        }
    }
}
