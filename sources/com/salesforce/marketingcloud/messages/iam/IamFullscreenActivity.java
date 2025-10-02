package com.salesforce.marketingcloud.messages.iam;

import android.app.PendingIntent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.dynatrace.android.callback.Callback;
import com.salesforce.marketingcloud.R;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;

@RestrictTo
/* loaded from: classes6.dex */
public class IamFullscreenActivity extends f {

    @Nullable
    protected View f;
    private k g;
    private InAppMessage h;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16991a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[InAppMessage.Type.values().length];
            b = iArr;
            try {
                iArr[InAppMessage.Type.full.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[InAppMessage.Type.fullImageFill.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[InAppMessage.LayoutOrder.values().length];
            f16991a = iArr2;
            try {
                iArr2[InAppMessage.LayoutOrder.ImageTitleBody.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16991a[InAppMessage.LayoutOrder.TitleImageBody.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private int a(InAppMessage inAppMessage) {
        int i = R.layout.mcsdk_iam_full_inset_itb;
        int i2 = a.b[inAppMessage.type().ordinal()];
        if (i2 == 1) {
            int i3 = a.f16991a[inAppMessage.layoutOrder().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    return (inAppMessage.media() == null || inAppMessage.media().size() != InAppMessage.Media.ImageSize.e2e) ? R.layout.mcsdk_iam_full_inset_tib : R.layout.mcsdk_iam_full_e2e_tib;
                }
            } else if (inAppMessage.media() != null && inAppMessage.media().size() == InAppMessage.Media.ImageSize.e2e) {
                return R.layout.mcsdk_iam_full_e2e_itb;
            }
        } else if (i2 == 2) {
            return (inAppMessage.media() == null || inAppMessage.media().size() != InAppMessage.Media.ImageSize.e2e) ? R.layout.mcsdk_iam_fif_inset_itb : R.layout.mcsdk_iam_fif_e2e_itb;
        }
        return i;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f
    public /* bridge */ /* synthetic */ void b(InAppMessage.Button button) throws PendingIntent.CanceledException {
        super.b(button);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, android.app.Activity
    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.activity.ComponentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, android.view.View.OnClickListener
    public /* bridge */ /* synthetic */ void onClick(View view) {
        Callback.g(view);
        try {
            super.onClick(view);
        } finally {
            Callback.h();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        k kVar;
        super.onConfigurationChanged(configuration);
        InAppMessage inAppMessage = this.h;
        if (inAppMessage == null || inAppMessage.type() != InAppMessage.Type.fullImageFill || configuration.orientation != 2 || (kVar = this.g) == null) {
            return;
        }
        kVar.a(j.a(kVar.c(), this.g.b()));
        finish();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (isFinishing()) {
            return;
        }
        this.f = findViewById(android.R.id.content);
        k kVarC = c();
        this.g = kVarC;
        InAppMessage inAppMessageD = kVarC.d();
        this.h = inAppMessageD;
        setContentView(a(inAppMessageD));
        new e(this, this.g.k()).a(this.f, this.g);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        View view = this.f;
        if (view != null) {
            ViewCompat.I(view, null);
        }
        super.onDestroy();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.SwipeDismissListener
    public /* bridge */ /* synthetic */ void onDismissed() {
        super.onDismissed();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.SwipeDismissListener
    public /* bridge */ /* synthetic */ void onSwipeStarted() {
        super.onSwipeStarted();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.SwipeDismissListener
    public /* bridge */ /* synthetic */ void onViewSettled() {
        super.onViewSettled();
    }
}
