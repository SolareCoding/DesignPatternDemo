package pub.solare.designpatterndemo.mvvm;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class VoteBean extends BaseObservable {

    public int voteCount;

    public VoteBean(int voteCount) {
        this.voteCount = voteCount;
    }
}
