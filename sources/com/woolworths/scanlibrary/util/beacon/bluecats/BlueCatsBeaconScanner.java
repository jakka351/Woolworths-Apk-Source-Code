package com.woolworths.scanlibrary.util.beacon.bluecats;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment$initialiseNativeBeaconScanner$1;
import com.woolworths.scanlibrary.util.beacon.Beacon;
import com.woolworths.scanlibrary.util.beacon.BeaconScanner;
import com.woolworths.scanlibrary.util.beacon.BeaconScannerError;
import com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconScanner;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/util/beacon/bluecats/BlueCatsBeaconScanner;", "Lcom/woolworths/scanlibrary/util/beacon/BeaconScanner;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ScannerState", "LifecycleState", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BlueCatsBeaconScanner implements BeaconScanner {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21364a;
    public BluetoothAdapter b;
    public BluetoothLeScanner c;
    public TapOnFragment$initialiseNativeBeaconScanner$1 d;
    public String e;
    public WeakReference f;
    public ScannerState g;
    public final BlueCatsBeaconScanner$lifecycleObserver$1 h;
    public final BlueCatsBeaconScanner$scanCallback$1 i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/beacon/bluecats/BlueCatsBeaconScanner$LifecycleState;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LifecycleState {
        public static final /* synthetic */ LifecycleState[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            LifecycleState[] lifecycleStateArr = {new LifecycleState("PAUSED", 0), new LifecycleState("RESUMED", 1)};
            d = lifecycleStateArr;
            e = EnumEntriesKt.a(lifecycleStateArr);
        }

        public static LifecycleState valueOf(String str) {
            return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
        }

        public static LifecycleState[] values() {
            return (LifecycleState[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/beacon/bluecats/BlueCatsBeaconScanner$ScannerState;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScannerState {
        public static final ScannerState d;
        public static final ScannerState e;
        public static final /* synthetic */ ScannerState[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            ScannerState scannerState = new ScannerState("IDLE", 0);
            d = scannerState;
            ScannerState scannerState2 = new ScannerState("SCANNING", 1);
            e = scannerState2;
            ScannerState[] scannerStateArr = {scannerState, scannerState2};
            f = scannerStateArr;
            g = EnumEntriesKt.a(scannerStateArr);
        }

        public static ScannerState valueOf(String str) {
            return (ScannerState) Enum.valueOf(ScannerState.class, str);
        }

        public static ScannerState[] values() {
            return (ScannerState[]) f.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconScanner$lifecycleObserver$1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconScanner$scanCallback$1] */
    public BlueCatsBeaconScanner(@NotNull Context context) {
        Intrinsics.h(context, "context");
        this.f21364a = context;
        this.g = ScannerState.d;
        LifecycleState[] lifecycleStateArr = LifecycleState.d;
        this.h = new DefaultLifecycleObserver() { // from class: com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconScanner$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(LifecycleOwner lifecycleOwner) {
                this.d.a();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onPause(LifecycleOwner lifecycleOwner) {
                BlueCatsBeaconScanner.LifecycleState[] lifecycleStateArr2 = BlueCatsBeaconScanner.LifecycleState.d;
                this.d.d();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(LifecycleOwner owner) {
                Intrinsics.h(owner, "owner");
                BlueCatsBeaconScanner blueCatsBeaconScanner = this.d;
                blueCatsBeaconScanner.getClass();
                BlueCatsBeaconScanner.LifecycleState[] lifecycleStateArr2 = BlueCatsBeaconScanner.LifecycleState.d;
                if (blueCatsBeaconScanner.g == BlueCatsBeaconScanner.ScannerState.e) {
                    blueCatsBeaconScanner.c(blueCatsBeaconScanner.e);
                }
            }
        };
        this.i = new ScanCallback() { // from class: com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconScanner$scanCallback$1
            /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
            @Override // android.bluetooth.le.ScanCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onBatchScanResults(java.util.List r9) {
                /*
                    r8 = this;
                    super.onBatchScanResults(r9)
                    r0 = 1
                    r1 = 0
                    if (r9 == 0) goto L4f
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r9 = r9.iterator()
                L12:
                    boolean r3 = r9.hasNext()
                    if (r3 == 0) goto L4e
                    java.lang.Object r3 = r9.next()
                    android.bluetooth.le.ScanResult r3 = (android.bluetooth.le.ScanResult) r3
                    com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconParser r4 = new com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconParser
                    android.bluetooth.le.ScanRecord r5 = r3.getScanRecord()
                    r4.<init>(r5)
                    byte[] r5 = r4.f21363a
                    if (r5 == 0) goto L47
                    int r6 = r5.length
                    r7 = 0
                    if (r6 != 0) goto L31
                    r6 = r0
                    goto L32
                L31:
                    r6 = r7
                L32:
                    r6 = r6 ^ r0
                    if (r6 != r0) goto L47
                    r5 = r5[r7]
                    if (r5 != 0) goto L47
                    com.woolworths.scanlibrary.util.beacon.Beacon r5 = new com.woolworths.scanlibrary.util.beacon.Beacon
                    java.lang.String r4 = r4.a()
                    int r3 = r3.getRssi()
                    r5.<init>(r4, r3)
                    goto L48
                L47:
                    r5 = r1
                L48:
                    if (r5 == 0) goto L12
                    r2.add(r5)
                    goto L12
                L4e:
                    r1 = r2
                L4f:
                    if (r1 == 0) goto L61
                    boolean r9 = r1.isEmpty()
                    r9 = r9 ^ r0
                    if (r9 != r0) goto L61
                    com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconScanner r9 = r8.f21365a
                    com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment$initialiseNativeBeaconScanner$1 r9 = r9.d
                    if (r9 == 0) goto L61
                    r9.a(r1)
                L61:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.util.beacon.bluecats.BlueCatsBeaconScanner$scanCallback$1.onBatchScanResults(java.util.List):void");
            }

            @Override // android.bluetooth.le.ScanCallback
            public final void onScanFailed(int i) {
                super.onScanFailed(i);
                TapOnFragment$initialiseNativeBeaconScanner$1 tapOnFragment$initialiseNativeBeaconScanner$1 = this.f21365a.d;
                if (tapOnFragment$initialiseNativeBeaconScanner$1 != null) {
                    tapOnFragment$initialiseNativeBeaconScanner$1.b(new BeaconScannerError.ScanFailed());
                }
            }

            @Override // android.bluetooth.le.ScanCallback
            public final void onScanResult(int i, ScanResult scanResult) {
                TapOnFragment$initialiseNativeBeaconScanner$1 tapOnFragment$initialiseNativeBeaconScanner$1;
                super.onScanResult(i, scanResult);
                BlueCatsBeaconParser blueCatsBeaconParser = new BlueCatsBeaconParser(scanResult != null ? scanResult.getScanRecord() : null);
                byte[] bArr = blueCatsBeaconParser.f21363a;
                if (bArr != null) {
                    if ((!(bArr.length == 0)) && bArr[0] == 0) {
                        BlueCatsBeaconScanner blueCatsBeaconScanner = this.f21365a;
                        if (blueCatsBeaconScanner.g != BlueCatsBeaconScanner.ScannerState.e || (tapOnFragment$initialiseNativeBeaconScanner$1 = blueCatsBeaconScanner.d) == null) {
                            return;
                        }
                        tapOnFragment$initialiseNativeBeaconScanner$1.a(CollectionsKt.Q(new Beacon(blueCatsBeaconParser.a(), scanResult != null ? scanResult.getRssi() : -255)));
                    }
                }
            }
        };
    }

    public final void a() {
        LifecycleOwner lifecycleOwner;
        Lifecycle d;
        this.b = null;
        this.c = null;
        this.d = null;
        WeakReference weakReference = this.f;
        if (weakReference == null || (lifecycleOwner = (LifecycleOwner) weakReference.get()) == null || (d = lifecycleOwner.getD()) == null) {
            return;
        }
        d.c(this.h);
    }

    public final void b() {
        Object systemService = this.f21364a.getSystemService("bluetooth");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        BluetoothAdapter adapter = ((BluetoothManager) systemService).getAdapter();
        this.b = adapter;
        this.c = adapter != null ? adapter.getBluetoothLeScanner() : null;
    }

    public final void c(String str) {
        TapOnFragment$initialiseNativeBeaconScanner$1 tapOnFragment$initialiseNativeBeaconScanner$1;
        ScanFilter scanFilterBuild;
        this.e = str;
        if (str != null && str.length() > 0) {
            TapOnFragment$initialiseNativeBeaconScanner$1 tapOnFragment$initialiseNativeBeaconScanner$12 = this.d;
            if (tapOnFragment$initialiseNativeBeaconScanner$12 != null) {
                tapOnFragment$initialiseNativeBeaconScanner$12.a(CollectionsKt.Q(new Beacon(str, -255)));
                return;
            }
            return;
        }
        BluetoothAdapter bluetoothAdapter = this.b;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            BluetoothAdapter bluetoothAdapter2 = this.b;
            if ((bluetoothAdapter2 == null || !bluetoothAdapter2.isEnabled()) && (tapOnFragment$initialiseNativeBeaconScanner$1 = this.d) != null) {
                tapOnFragment$initialiseNativeBeaconScanner$1.b(BeaconScannerError.BluetoothNotReady.f21362a);
                return;
            }
            return;
        }
        if (this.c == null) {
            b();
        }
        try {
            BluetoothLeScanner bluetoothLeScanner = this.c;
            if (bluetoothLeScanner != null) {
                ScanFilter.Builder manufacturerData = new ScanFilter.Builder().setManufacturerData(260, new byte[]{0});
                List<ScanFilter> listQ = (manufacturerData == null || (scanFilterBuild = manufacturerData.build()) == null) ? null : CollectionsKt.Q(scanFilterBuild);
                ScanSettings.Builder scanMode = new ScanSettings.Builder().setScanMode(2);
                bluetoothLeScanner.startScan(listQ, scanMode != null ? scanMode.build() : null, this.i);
            }
            this.g = ScannerState.e;
        } catch (IllegalStateException unused) {
            TapOnFragment$initialiseNativeBeaconScanner$1 tapOnFragment$initialiseNativeBeaconScanner$13 = this.d;
            if (tapOnFragment$initialiseNativeBeaconScanner$13 != null) {
                tapOnFragment$initialiseNativeBeaconScanner$13.b(new BeaconScannerError.ScannerFailure());
            }
        } catch (SecurityException unused2) {
            TapOnFragment$initialiseNativeBeaconScanner$1 tapOnFragment$initialiseNativeBeaconScanner$14 = this.d;
            if (tapOnFragment$initialiseNativeBeaconScanner$14 != null) {
                tapOnFragment$initialiseNativeBeaconScanner$14.b(new BeaconScannerError.ScannerFailure());
            }
        }
    }

    public final void d() {
        try {
            BluetoothLeScanner bluetoothLeScanner = this.c;
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this.i);
            }
        } catch (IllegalStateException unused) {
            TapOnFragment$initialiseNativeBeaconScanner$1 tapOnFragment$initialiseNativeBeaconScanner$1 = this.d;
            if (tapOnFragment$initialiseNativeBeaconScanner$1 != null) {
                tapOnFragment$initialiseNativeBeaconScanner$1.b(new BeaconScannerError.ScannerFailure());
            }
        } catch (SecurityException unused2) {
            TapOnFragment$initialiseNativeBeaconScanner$1 tapOnFragment$initialiseNativeBeaconScanner$12 = this.d;
            if (tapOnFragment$initialiseNativeBeaconScanner$12 != null) {
                tapOnFragment$initialiseNativeBeaconScanner$12.b(new BeaconScannerError.ScannerFailure());
            }
        }
    }

    public final void e() {
        BluetoothAdapter bluetoothAdapter = this.b;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            return;
        }
        this.g = ScannerState.d;
        d();
    }
}
