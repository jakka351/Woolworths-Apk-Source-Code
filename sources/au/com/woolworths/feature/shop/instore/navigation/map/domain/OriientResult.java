package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.Exception;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\f\b\u0001\u0010\u0004*\u00060\u0002j\u0002`\u00032\u00020\u0005:\u0002\u0001\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientResult;", "Success", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Failure", "", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientResult$Failure;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientResult$Success;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OriientResult<Success, Failure extends Exception> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\f\b\u0003\u0010\u0004*\u00060\u0002j\u0002`\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientResult$Failure;", "Success", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Failure", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientResult;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failure<Success, Failure extends Exception> extends OriientResult<Success, Failure> {

        /* renamed from: a, reason: collision with root package name */
        public final OriientError f7367a;

        public Failure(OriientError oriientError) {
            this.f7367a = oriientError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.f7367a.equals(((Failure) obj).f7367a);
        }

        public final int hashCode() {
            return this.f7367a.hashCode();
        }

        public final String toString() {
            return "Failure(value=" + this.f7367a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\f\b\u0003\u0010\u0004*\u00060\u0002j\u0002`\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientResult$Success;", "Success", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Failure", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/OriientResult;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success<Success, Failure extends Exception> extends OriientResult<Success, Failure> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f7368a;

        public Success(Object obj) {
            this.f7368a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.c(this.f7368a, ((Success) obj).f7368a);
        }

        public final int hashCode() {
            Object obj = this.f7368a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return b.n(this.f7368a, "Success(value=", ")");
        }
    }
}
