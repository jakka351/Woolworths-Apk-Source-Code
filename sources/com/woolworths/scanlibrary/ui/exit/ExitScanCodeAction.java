package com.woolworths.scanlibrary.ui.exit;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.models.receipt.Receipt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction;", "", "MoveToThankYouPage", "ScanNotComplete", "TransactionCancelled", "TransferToPosCompleted", "ErrorGeneratingReceipt", "ErrorConfirmingTransferToPos", "RequestToConfirmBarCodeScanByStaffMember", "VoidedTransaction", "ShowReceipt", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$ErrorConfirmingTransferToPos;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$ErrorGeneratingReceipt;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$MoveToThankYouPage;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$RequestToConfirmBarCodeScanByStaffMember;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$ScanNotComplete;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$ShowReceipt;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$TransactionCancelled;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$TransferToPosCompleted;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$VoidedTransaction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ExitScanCodeAction {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$ErrorConfirmingTransferToPos;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ErrorConfirmingTransferToPos extends ExitScanCodeAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f21257a;

        public ErrorConfirmingTransferToPos(String errorMsg) {
            Intrinsics.h(errorMsg, "errorMsg");
            this.f21257a = errorMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorConfirmingTransferToPos) && Intrinsics.c(this.f21257a, ((ErrorConfirmingTransferToPos) obj).f21257a);
        }

        public final int hashCode() {
            return this.f21257a.hashCode();
        }

        public final String toString() {
            return YU.a.h("ErrorConfirmingTransferToPos(errorMsg=", this.f21257a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$ErrorGeneratingReceipt;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorGeneratingReceipt extends ExitScanCodeAction {

        /* renamed from: a, reason: collision with root package name */
        public static final ErrorGeneratingReceipt f21258a = new ErrorGeneratingReceipt();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$MoveToThankYouPage;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MoveToThankYouPage extends ExitScanCodeAction {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MoveToThankYouPage);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "MoveToThankYouPage(cartId=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$RequestToConfirmBarCodeScanByStaffMember;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestToConfirmBarCodeScanByStaffMember extends ExitScanCodeAction {

        /* renamed from: a, reason: collision with root package name */
        public static final RequestToConfirmBarCodeScanByStaffMember f21259a = new RequestToConfirmBarCodeScanByStaffMember();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$ScanNotComplete;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScanNotComplete extends ExitScanCodeAction {

        /* renamed from: a, reason: collision with root package name */
        public static final ScanNotComplete f21260a = new ScanNotComplete();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$ShowReceipt;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowReceipt extends ExitScanCodeAction {

        /* renamed from: a, reason: collision with root package name */
        public final Receipt f21261a;

        public ShowReceipt(Receipt receipt) {
            Intrinsics.h(receipt, "receipt");
            this.f21261a = receipt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowReceipt) && Intrinsics.c(this.f21261a, ((ShowReceipt) obj).f21261a);
        }

        public final int hashCode() {
            return this.f21261a.hashCode();
        }

        public final String toString() {
            return "ShowReceipt(receipt=" + this.f21261a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$TransactionCancelled;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TransactionCancelled extends ExitScanCodeAction {

        /* renamed from: a, reason: collision with root package name */
        public static final TransactionCancelled f21262a = new TransactionCancelled();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$TransferToPosCompleted;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TransferToPosCompleted extends ExitScanCodeAction {

        /* renamed from: a, reason: collision with root package name */
        public static final TransferToPosCompleted f21263a = new TransferToPosCompleted();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction$VoidedTransaction;", "Lcom/woolworths/scanlibrary/ui/exit/ExitScanCodeAction;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VoidedTransaction extends ExitScanCodeAction {

        /* renamed from: a, reason: collision with root package name */
        public static final VoidedTransaction f21264a = new VoidedTransaction();
    }
}
