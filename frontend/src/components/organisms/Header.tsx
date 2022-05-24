/* eslint-disable prefer-arrow/prefer-arrow-functions */
import * as React from 'react';
import Box from '@mui/material/Box';
import Link from '@mui/material/Link';
import AppBar from '../atoms/AppBar';
import Toolbar from '../atoms/Toolbar';

const rightLink = {
  fontSize: 25,
  color: 'common.white',
  ml: 3,
};

function Header() {
  return (
    <div>
      <AppBar position="fixed">
        <Toolbar sx={{ justifyContent: 'space-between' }}>
          {/* <Box sx={{ flex: 1, justifyContent: 'flex-start' }}>
            <Link
              variant="h3"
              underline="none"
              color="inherit"
              href="/"
              sx={{ fontSize: 24 }}
            >
              ecotiya
            </Link>
          </Box> */}
          <Box sx={{ flex: 1, display: 'flex', justifyContent: 'flex-end' }}>
            <Link
              color="inherit"
              variant="subtitle1"
              underline="hover"
              href="/"
              sx={rightLink}
            >
              Home
            </Link>
            <Link
              color="inherit"
              variant="subtitle1"
              underline="hover"
              href="/about"
              sx={rightLink}
            >
              About
            </Link>
            <Link
              color="inherit"
              variant="subtitle1"
              underline="hover"
              href="/contact"
              sx={rightLink}
            >
              Contact
            </Link>
          </Box>
        </Toolbar>
      </AppBar>
      <Toolbar />
    </div>
  );
}

export default Header;
