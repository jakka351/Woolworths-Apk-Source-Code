package au.com.woolworths.feature.shop.myorders.details.perfectorder;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/perfectorder/PerfectOrderInteractor;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PerfectOrderInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final PerfectOrderRepository f7780a;

    public PerfectOrderInteractor(PerfectOrderRepository perfectOrderRepository) {
        this.f7780a = perfectOrderRepository;
    }

    public final void a() {
        String str;
        PerfectOrderDataSource perfectOrderDataSource = this.f7780a.f7781a;
        SharedPreferences sharedPreferences = perfectOrderDataSource.f7779a;
        SharedPreferences sharedPreferences2 = perfectOrderDataSource.f7779a;
        LocalDateTime localDateTimeNow = null;
        try {
            LocalDateTime localDateTime = LocalDateTime.parse(sharedPreferences.getString("last_visit_timestamp", ""), PerfectOrderDataSource.b);
            if (localDateTime != null) {
                localDateTimeNow = localDateTime;
            }
        } catch (DateTimeParseException unused) {
        }
        if (localDateTimeNow == null) {
            localDateTimeNow = LocalDateTime.now();
        }
        if (LocalDateTime.now().isAfter(localDateTimeNow.plusDays(1L))) {
            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
            editorEdit.remove("set_of_order_ids");
            editorEdit.apply();
        }
        LocalDateTime localDateTimeNow2 = LocalDateTime.now();
        if (localDateTimeNow2 == null || (str = localDateTimeNow2.format(PerfectOrderDataSource.b)) == null) {
            return;
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
        editorEdit2.putString("last_visit_timestamp", str);
        editorEdit2.apply();
    }
}
