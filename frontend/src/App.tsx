import { FC } from 'react';

import CssBaseline from '@mui/material/CssBaseline';
import { makeStyles } from '@mui/styles';
import { Header, Footer } from './components/organisms/index';
import Landing from './components/pages/Landing';

const useStyles = makeStyles({
  root: {
    minHeight: '100vh',
    backgroundColor: '#121212',
    backgroundRepeat: 'no-repeat',
    backgroundSize: 'cover',
  },
});

const App: FC = () => {
  const classes = useStyles();

  return (
    <div className={classes.root}>
      <CssBaseline />
      <Header />
      <Landing />
      <Footer />
    </div>
  );
};

export default App;
