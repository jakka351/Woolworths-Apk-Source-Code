package au.com.woolworths.feature.rewards.account.sso;

import android.content.SharedPreferences;
import android.webkit.ValueCallback;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsRepositoryOld;
import java.util.UUID;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RewardsMagicLinkActivity f5813a;

    public /* synthetic */ c(RewardsMagicLinkActivity rewardsMagicLinkActivity) {
        this.f5813a = rewardsMagicLinkActivity;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        int i = RewardsMagicLinkActivity.F;
        String strL0 = str != null ? StringsKt.l0(str, '\"') : null;
        if (strL0 != null) {
            RewardsMagicLinkViewModel rewardsMagicLinkViewModelP4 = this.f5813a.P4();
            try {
                UUID.fromString(strL0);
                AccountSettingsRepositoryOld accountSettingsRepositoryOld = rewardsMagicLinkViewModelP4.f.f5770a;
                SharedPreferences.Editor editorEdit = accountSettingsRepositoryOld.g.edit();
                editorEdit.putString("rewards_chatbot_session", accountSettingsRepositoryOld.f.j(strL0));
                editorEdit.apply();
            } catch (IllegalArgumentException unused) {
                if (rewardsMagicLinkViewModelP4.n < 10) {
                    rewardsMagicLinkViewModelP4.n++;
                    BuildersKt.c(ViewModelKt.a(rewardsMagicLinkViewModelP4), null, null, new RewardsMagicLinkViewModel$validateChatbotSessionId$1$1(rewardsMagicLinkViewModelP4, null), 3);
                }
            }
        }
    }
}
