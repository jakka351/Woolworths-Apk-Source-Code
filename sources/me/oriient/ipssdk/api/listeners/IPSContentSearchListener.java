package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import me.oriient.ipssdk.api.models.IPSContentItem;
import me.oriient.ipssdk.ips.IPSContentSearchPage;

@Keep
/* loaded from: classes2.dex */
public interface IPSContentSearchListener extends IPSFailable {
    void onSearchResult(@NonNull List<IPSContentItem> list, @Nullable IPSContentSearchPage iPSContentSearchPage);
}
