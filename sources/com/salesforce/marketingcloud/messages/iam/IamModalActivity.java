package com.salesforce.marketingcloud.messages.iam;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.dynatrace.android.callback.Callback;
import com.salesforce.marketingcloud.R;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class IamModalActivity extends f implements View.OnClickListener {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16992a;

        static {
            int[] iArr = new int[InAppMessage.LayoutOrder.values().length];
            f16992a = iArr;
            try {
                iArr[InAppMessage.LayoutOrder.ImageTitleBody.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16992a[InAppMessage.LayoutOrder.TitleImageBody.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public int a(InAppMessage inAppMessage) {
        int i = R.layout.mcsdk_iam_modal_inset_itb;
        InAppMessage.Media media = inAppMessage.media();
        int i2 = a.f16992a[inAppMessage.layoutOrder().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return (media == null || media.size() != InAppMessage.Media.ImageSize.e2e) ? R.layout.mcsdk_iam_modal_inset_tib : R.layout.mcsdk_iam_modal_e2e_tib;
            }
        } else if (media != null && media.size() == InAppMessage.Media.ImageSize.e2e) {
            return R.layout.mcsdk_iam_modal_e2e_itb;
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

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (isFinishing()) {
            return;
        }
        setContentView(a(c().d()));
        new l(this, c().k()).a(findViewById(android.R.id.content), c());
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
