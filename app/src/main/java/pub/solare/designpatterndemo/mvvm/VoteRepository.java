package pub.solare.designpatterndemo.mvvm;

public class VoteRepository implements IVoteRepository{

    private VoteBean mVoteBean;
    private IVoteViewModel mVoteViewModel;

    public VoteRepository(IVoteViewModel viewModel) {
        mVoteBean = new VoteBean(100);
        mVoteViewModel = viewModel;
    }

    @Override
    public void addVoteCount() {
        mVoteBean.voteCount ++;
        mVoteViewModel.onVoteCountChanged();
    }

    @Override
    public int getVoteCount() {
        return mVoteBean.voteCount;
    }
}
