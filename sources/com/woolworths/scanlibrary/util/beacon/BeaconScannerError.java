package com.woolworths.scanlibrary.util.beacon;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/util/beacon/BeaconScannerError;", "", "BluetoothNotReady", "ScanFailed", "ScannerFailure", "Lcom/woolworths/scanlibrary/util/beacon/BeaconScannerError$BluetoothNotReady;", "Lcom/woolworths/scanlibrary/util/beacon/BeaconScannerError$ScanFailed;", "Lcom/woolworths/scanlibrary/util/beacon/BeaconScannerError$ScannerFailure;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BeaconScannerError {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/beacon/BeaconScannerError$BluetoothNotReady;", "Lcom/woolworths/scanlibrary/util/beacon/BeaconScannerError;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BluetoothNotReady extends BeaconScannerError {

        /* renamed from: a, reason: collision with root package name */
        public static final BluetoothNotReady f21362a = new BluetoothNotReady();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/beacon/BeaconScannerError$ScanFailed;", "Lcom/woolworths/scanlibrary/util/beacon/BeaconScannerError;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScanFailed extends BeaconScannerError {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/beacon/BeaconScannerError$ScannerFailure;", "Lcom/woolworths/scanlibrary/util/beacon/BeaconScannerError;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScannerFailure extends BeaconScannerError {
    }
}
