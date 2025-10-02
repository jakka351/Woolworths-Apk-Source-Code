package androidx.compose.runtime.internal;

import androidx.compose.runtime.ExperimentalComposeApi;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/internal/DecoyImplementation;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "id", "<init>", "(Ljava/lang/String;J)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
@ExperimentalComposeApi
/* loaded from: classes2.dex */
public @interface DecoyImplementation {
}
