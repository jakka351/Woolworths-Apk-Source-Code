package com.woolworths.scanlibrary.ui.parking;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.foundation.barcode.encoder.BarcodeType;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity;
import com.woolworths.scanlibrary.databinding.ActivityParkingVoucherBinding;
import com.woolworths.scanlibrary.models.receipt.Voucher;
import com.woolworths.scanlibrary.ui.parking.ParkingVoucherContract;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/woolworths/scanlibrary/ui/parking/ParkingVoucherActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/parking/ParkingVoucherContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/parking/ParkingVoucherContract$View;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ParkingVoucherActivity extends DaggerBaseActivity<ParkingVoucherContract.Presenter> implements ParkingVoucherContract.View {
    public static final /* synthetic */ int H = 0;
    public ActivityParkingVoucherBinding G;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/parking/ParkingVoucherActivity$Companion;", "", "", "KEY_PARKING_VOUCHER", "Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(FragmentActivity fragmentActivity, Voucher parkingVoucher) {
            Intrinsics.h(parkingVoucher, "parkingVoucher");
            Pair[] pairArr = {new Pair("key.voucher.parking", parkingVoucher)};
            Intent intent = new Intent(fragmentActivity, (Class<?>) ParkingVoucherActivity.class);
            intent.addFlags(0);
            intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 1)));
            fragmentActivity.startActivity(intent);
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_parking_voucher;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
        getWindow().addFlags(128);
        ActivityParkingVoucherBinding activityParkingVoucherBinding = (ActivityParkingVoucherBinding) DataBindingUtil.d(this, R.layout.activity_parking_voucher);
        Intrinsics.h(activityParkingVoucherBinding, "<set-?>");
        this.G = activityParkingVoucherBinding;
        Activities.SngParkingVoucherActivity.Extras extras = (Activities.SngParkingVoucherActivity.Extras) getIntent().getParcelableExtra("EXTRA_VOUCHER_INFO");
        Voucher voucher = extras != null ? new Voucher(extras.d, null, 2, null) : (Voucher) getIntent().getParcelableExtra("key.voucher.parking");
        if (voucher == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ActivityParkingVoucherBinding activityParkingVoucherBinding2 = this.G;
        if (activityParkingVoucherBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityParkingVoucherBinding2.z.a(voucher.getBarcode(), BarcodeType.d);
        ActivityParkingVoucherBinding activityParkingVoucherBinding3 = this.G;
        if (activityParkingVoucherBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityParkingVoucherBinding3.B.setText(voucher.getBarcode());
        ActivityParkingVoucherBinding activityParkingVoucherBinding4 = this.G;
        if (activityParkingVoucherBinding4 != null) {
            activityParkingVoucherBinding4.y.setOnClickListener(new a(this, 0));
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        getWindow().setAttributes(attributes);
        getWindow().addFlags(4);
        super.onCreate(bundle);
    }
}
