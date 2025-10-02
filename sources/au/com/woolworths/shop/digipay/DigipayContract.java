package au.com.woolworths.shop.digipay;

import au.com.woolworths.shop.digipay.models.SubmittedInstrument;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/digipay/DigipayContract;", "", "Actions", "Error", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DigipayContract {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/digipay/DigipayContract$Actions;", "", "EmitError", "EmitSubmittedInstrumentData", "TriggerIframeSubmitFormIfAllowed", "Lau/com/woolworths/shop/digipay/DigipayContract$Actions$EmitError;", "Lau/com/woolworths/shop/digipay/DigipayContract$Actions$EmitSubmittedInstrumentData;", "Lau/com/woolworths/shop/digipay/DigipayContract$Actions$TriggerIframeSubmitFormIfAllowed;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/DigipayContract$Actions$EmitError;", "Lau/com/woolworths/shop/digipay/DigipayContract$Actions;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class EmitError extends Actions {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EmitError)) {
                    return false;
                }
                Error error = Error.d;
                return true;
            }

            public final int hashCode() {
                return Error.d.hashCode();
            }

            public final String toString() {
                return "EmitError(error=" + Error.d + ")";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/DigipayContract$Actions$EmitSubmittedInstrumentData;", "Lau/com/woolworths/shop/digipay/DigipayContract$Actions;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class EmitSubmittedInstrumentData extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final SubmittedInstrument f10906a;

            public EmitSubmittedInstrumentData(SubmittedInstrument submittedInstrument) {
                this.f10906a = submittedInstrument;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EmitSubmittedInstrumentData) && Intrinsics.c(this.f10906a, ((EmitSubmittedInstrumentData) obj).f10906a);
            }

            public final int hashCode() {
                return this.f10906a.hashCode();
            }

            public final String toString() {
                return "EmitSubmittedInstrumentData(submittedInstrument=" + this.f10906a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/DigipayContract$Actions$TriggerIframeSubmitFormIfAllowed;", "Lau/com/woolworths/shop/digipay/DigipayContract$Actions;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TriggerIframeSubmitFormIfAllowed extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final TriggerIframeSubmitFormIfAllowed f10907a = new TriggerIframeSubmitFormIfAllowed();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/DigipayContract$Error;", "", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error {
        public static final Error d;
        public static final /* synthetic */ Error[] e;
        public static final /* synthetic */ EnumEntries f;

        static {
            Error error = new Error("FATAL_ERROR", 0);
            d = error;
            Error[] errorArr = {error};
            e = errorArr;
            f = EnumEntriesKt.a(errorArr);
        }

        public static Error valueOf(String str) {
            return (Error) Enum.valueOf(Error.class, str);
        }

        public static Error[] values() {
            return (Error[]) e.clone();
        }
    }
}
