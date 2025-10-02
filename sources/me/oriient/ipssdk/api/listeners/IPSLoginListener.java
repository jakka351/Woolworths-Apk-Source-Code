package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;
import me.oriient.ipssdk.api.models.IPSSpace;

@Keep
/* loaded from: classes2.dex */
public interface IPSLoginListener extends IPSFailable {
    void onLogin(@NonNull List<IPSSpace> list);
}
