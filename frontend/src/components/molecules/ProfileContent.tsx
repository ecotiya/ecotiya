import { Grid, Typography } from '@mui/material';
import { makeStyles } from '@mui/styles';

type ProfileContentProps = {
  content: string | undefined;
};

const useStyles = makeStyles({
  textContent: {
    whiteSpace: 'pre-line',
  },
});

const ProfileContent = (props: ProfileContentProps) => {
  const classes = useStyles();
  const { content } = props;

  return (
    <Grid item lg={8} md={6} xs={12}>
      <Typography
        color="textPrimary"
        gutterBottom
        variant="body1"
        className={classes.textContent}
      >
        {content}
      </Typography>
    </Grid>
  );
};

export default ProfileContent;
