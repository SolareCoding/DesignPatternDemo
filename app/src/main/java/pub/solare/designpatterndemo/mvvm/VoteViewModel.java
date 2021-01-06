package pub.solare.designpatterndemo.mvvm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VoteViewModel extends ViewModel implements IVoteViewModel{

    public final MutableLiveData<Integer> voteCount = new MutableLiveData<>();
    private IVoteRepository mVoteRepository;

    public VoteViewModel() {
        mVoteRepository = new VoteRepository(this);
        voteCount.setValue(mVoteRepository.getVoteCount());
    }

    public void addVote() {
        mVoteRepository.addVoteCount();
    }

    @Override
    public void onVoteCountChanged() {
        voteCount.setValue(mVoteRepository.getVoteCount());
    }
}
